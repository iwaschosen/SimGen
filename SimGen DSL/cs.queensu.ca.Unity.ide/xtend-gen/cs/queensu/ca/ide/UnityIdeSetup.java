/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cs.queensu.ca.UnityRuntimeModule;
import cs.queensu.ca.UnityStandaloneSetup;
import cs.queensu.ca.ide.UnityIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class UnityIdeSetup extends UnityStandaloneSetup {
  @Override
  public Injector createInjector() {
    UnityRuntimeModule _unityRuntimeModule = new UnityRuntimeModule();
    UnityIdeModule _unityIdeModule = new UnityIdeModule();
    return Guice.createInjector(Modules2.mixin(_unityRuntimeModule, _unityIdeModule));
  }
}