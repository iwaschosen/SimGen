package cs.queensu.ca.generator

import java.io.IOException
import java.util.Map
import org.eclipse.emf.common.EMFPlugin
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EPackage.Registry
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage
import org.eclipse.papyrusrt.codegen.cpp.profile.RTCppProperties.RTCppPropertiesPackage
import org.eclipse.papyrusrt.umlrt.profile.UMLRealTime.UMLRealTimePackage
import org.eclipse.papyrusrt.umlrt.profile.statemachine.UMLRTStateMachines.UMLRTStateMachinesPackage
import org.eclipse.uml2.uml.Collaboration
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Event
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Message
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Profile
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.UMLPlugin
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl
import org.eclipse.uml2.uml.internal.resource.UMLResourceImpl
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.uml2.uml.util.UMLUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class UMLRTLibraryGenerator {
	UMLResource umlResource
	Resource unityResource
	IFileSystemAccess2 fsa
	IGeneratorContext context
	String umlModelPath
	Model umlRTModel

	// / make it runnable for test purpose, remove it later
	new(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		super()
		this.setUnityResource(resource)
		this.setFsa(fsa)
		this.setContext(context) // this.generateModelLibrary();
		// this.intUMLModel("/UnityGateway/model.uml");
	}

	new() { // TODO Auto-generated constructor stub
	}

	def void generateModelLibrary() {
		// this.intUMLModel("../cs.queensu.ca.UnityUMLRTGateWay/UnityGateway/model.uml");
		this.intUMLModel("/UnityGateway/model.uml")
		this.loadUMLModel()
		createClass("test")
		createUMLRTCapsule("testCapsule111")
	}

	def void intUMLModel(String umlModelPath) {
		this.setUmlModelPath(umlModelPath)
		var ResourceSet resourceSet = new ResourceSetImpl()
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl())
		var Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap()
		// Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		// org.eclipse.uml2.uml.util.UMLUtil.init(resourceSet);
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE)
			resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(UMLRealTimePackage.eNS_URI, UMLRealTimePackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(RTCppPropertiesPackage.eNS_URI, RTCppPropertiesPackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(UMLRTStateMachinesPackage.eNS_URI, UMLRTStateMachinesPackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
			resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
			org.eclipse.uml2.uml.resources.util.UMLResourcesUtil.init(resourceSet)
			uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/UMLRealTimeSM-addendum.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRealTimeSM-addendum.profile.uml/"))
			uriMap.put(URI.createURI("pathmap://UMLRT_CPP/RTCppProperties.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/RTCppProperties.profile.uml/"))
			uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/uml-rt.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/uml-rt.profile.uml/"))
			uriMap.put(URI.createURI("pathmap://UMLRTRTSLIB/UMLRT-RTS.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRT-RTS.uml/"))
		}
		this.umlResource = resourceSet.createResource(URI.createURI(this.getUmlModelPath())) as UMLResource
	}

	def boolean loadUMLModel() {
		try {
			this.umlResource.load(null)
			// EcoreUtil.resolveAll(umlResource);
			// this.setUmlRTModel((Model) this.umlResource.getContents().get(0));
			this.setUmlRTModel(
				(EcoreUtil.getObjectByType(umlResource.getContents(), UMLPackage.Literals.MODEL) as Model))
			return true
		} catch (IOException e) {
			e.printStackTrace()
			return false
		}

	}

	def void saveUMLModel() {
		try {
			umlResource.save(null) // no save options needed
		} catch (IOException ioe) {
			System::err.println(ioe.getMessage())
		}

	}

	// / create package
	def protected org.eclipse.uml2.uml.Package createPackage(org.eclipse.uml2.uml.Package owner, String name) {
		var org.eclipse.uml2.uml.Package package_ = owner.createNestedPackage(name)
		return package_
	}

	def protected org.eclipse.uml2.uml.Package createPackage(String name) {
		var org.eclipse.uml2.uml.Package package_ = this.getUmlRTModel().createNestedPackage(name)
		return package_
	}

	// / create top capsule
	def org.eclipse.uml2.uml.Class createUMLRTCapsule(String name) {
		var org.eclipse.uml2.uml.Class class_ = this.createClass(name)
		if (applyStreotype(class_, "Capsule") <= 0) {
			System::err.println("Capsule Stereotype is not aplied")
		}
		return class_
	}

	// / apply profiles to UMLRTModel
	def void applyUMLRTProfile() {
		var Profile profile = UMLFactory.eINSTANCE.createProfile() // do it later, for now we get the model which have applied profiles
		// profile.
	}

	// / add messages to protocols
	// / create connection
	// / remove message from protocols
	// / remove 
	// / create class
	def org.eclipse.uml2.uml.Class createClass(String name) {
		var org.eclipse.uml2.uml.Class class_ = this.getUmlRTModel().createOwnedClass(name, false)
		return class_
	}

	def org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package owner, String name) {
		var org.eclipse.uml2.uml.Class class_ = owner.createOwnedClass(name, false)
		return class_
	}

	// / create port kind
	def org.eclipse.uml2.uml.Port createPortKind(org.eclipse.uml2.uml.Class owner, String kind) {
		var org.eclipse.uml2.uml.Port portKind1 = this.createPort(owner, null, null, null, null, null)
		if (kind === "SAP") {
			portKind1.setIsService(false)
		} else if (kind === "SPP") {
			portKind1.setIsService(true)
		}
		return portKind1
	}

	// / create port
	def org.eclipse.uml2.uml.Port createPort(org.eclipse.uml2.uml.Class owner, String name, Boolean conj,
		Integer lowerValue, Integer upperValue, String type) {
		var org.eclipse.uml2.uml.Port port1 = owner.createOwnedPort(name, null)
		this.applyStreotype(port1, "Port1")
		port1.setLower(lowerValue)
		port1.setUpper(upperValue)
		port1.setIsConjugated(conj)
		// port1.setType(type);
		return port1
	}

	// / create protocol 	
	def org.eclipse.uml2.uml.Collaboration createProtocol(String name) {
		var org.eclipse.uml2.uml.Package pm = this.createPackage(name)
		var org.eclipse.uml2.uml.Collaboration protocol1 = this.createCollaboration(pm, name)
		var org.eclipse.uml2.uml.Interface baseInterface = this.createInterface(pm, name)
		var org.eclipse.uml2.uml.Interface conjugateInterface = this.createInterface(pm, name.concat("~"))
		var org.eclipse.uml2.uml.Interface binaryInterface = this.createInterface(pm, name.concat("IO"))
		this.createUsage(pm, protocol1, baseInterface)
		this.createUsage(pm, protocol1, conjugateInterface)
		this.createUsage(pm, protocol1, binaryInterface)
		this.createRealization(protocol1, baseInterface)
		this.createRealization(protocol1, conjugateInterface)
		this.createRealization(protocol1, binaryInterface)
		applyStreotype(pm, "Protocol")
		this.createMessage(binaryInterface, "signal1")
		// create conncetion between operation and event
		// this.createEvent(pm, "event1").;
		return protocol1
	}

	// // createRealization
	def org.eclipse.uml2.uml.InterfaceRealization createRealization(org.eclipse.uml2.uml.Collaboration collaboration1,
		org.eclipse.uml2.uml.Interface interface1) {
		var org.eclipse.uml2.uml.InterfaceRealization realization1 = collaboration1.
			createInterfaceRealization("", interface1)
		return realization1
	}

	// / createUsage
	def org.eclipse.uml2.uml.Usage createUsage(org.eclipse.uml2.uml.Package owner,
		org.eclipse.uml2.uml.Collaboration collaboration, org.eclipse.uml2.uml.Interface interface1) {
		var org.eclipse.uml2.uml.Usage usage1 = owner.createUsage(collaboration)
		usage1.createDependency(interface1)
		return usage1
	}

	// / create Event
	def org.eclipse.uml2.uml.Event createEvent(org.eclipse.uml2.uml.Package owner, String name) {
		var org.eclipse.uml2.uml.Event event1 = (owner.createOwnedType(name, UMLPackage.Literals.EVENT) as Event)
		return event1
	}

	// / create Signal(message)
	def org.eclipse.uml2.uml.Operation createMessage(org.eclipse.uml2.uml.Interface owner, String name) {
		var Operation operation1 = owner.createOwnedOperation(name, null, null, null)
		// org.eclipse.uml2.uml.Event event1=this.createEvent();
		return operation1
	}

	// / create Collaboration
	def org.eclipse.uml2.uml.Collaboration createCollaboration(org.eclipse.uml2.uml.Package owner, String name) {
		var org.eclipse.uml2.uml.Collaboration collaboration1 = (owner.createOwnedType(name,
			UMLPackage.Literals.COLLABORATION) as Collaboration)
		return collaboration1
	}

	// / create UML Interface 
	def org.eclipse.uml2.uml.Interface createInterface(org.eclipse.uml2.uml.Package owner, String name) {
		var org.eclipse.uml2.uml.Interface interface1 = (owner.createOwnedType(name,
			UMLPackage.Literals.INTERFACE) as Interface)
		return interface1
	}

	// / apply stereotype
	def int applyStreotype(org.eclipse.uml2.uml.Element umlModelElement, String stereotypeName) {
		var int result = 0
		for (Profile profile : this.getUmlRTModel().getAllAppliedProfiles()) {
			var EPackage ep = profile.getDefinition()
			System::out.println(profile.getLabel())
		}
		// umlModelElement.getApplicableStereotypes();
		for (org.eclipse.uml2.uml.Stereotype stereoType : umlModelElement.getApplicableStereotypes()) {
			System::out.println(stereoType.getName())
			if (stereoType.getName().equals(stereotypeName)) {
				umlModelElement.applyStereotype(stereoType)
				result++
			}
		}
		return result
	}

	def String getUmlModelPath() {
		return umlModelPath
	}

	def void setUmlModelPath(String umlModelPath) {
		this.umlModelPath = umlModelPath
	}

	def Model getUmlRTModel() {
		return umlRTModel
	}

	def void setUmlRTModel(Model umlRTModel) {
		this.umlRTModel = umlRTModel
	}

	def Resource getUnityResource() {
		return unityResource
	}

	def void setUnityResource(Resource unityResource) {
		this.unityResource = unityResource
	}

	def IFileSystemAccess2 getFsa() {
		return fsa
	}

	def void setFsa(IFileSystemAccess2 fsa) {
		this.fsa = fsa
	}

	def IGeneratorContext getContext() {
		return context
	}

	def void setContext(IGeneratorContext context) {
		this.context = context
	}
}
