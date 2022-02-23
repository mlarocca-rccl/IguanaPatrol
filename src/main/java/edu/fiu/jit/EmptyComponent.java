/**
 * 
 */
package edu.fiu.jit;

import java.util.List;

/**
 * @author asengupt
 *
 */
public abstract class EmptyComponent implements GenericComponent {
	// Create a name to store the component name - can be updated
	// by subclasses or an overridden method used
	protected String name = "Template main component";
	
	public EmptyComponent() {
		name = getComponentName();
	}
	
	@Override
	public boolean selfCheck() {
		// The empty component has a 50% chance of failure
		return SelfCheckUtils.randomCheck(0.5);
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// No sub components of the empty component
		return null;
	}

}
