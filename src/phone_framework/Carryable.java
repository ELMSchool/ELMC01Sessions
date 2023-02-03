package phone_framework;

/**
 * Interfaces are special TYPES (NOT classes, NOT objects)
 * that are 100% abstract (exclusions apply)
 * which serve the purpose of sharing specific
 * characteristics (abstract methods) among
 * different classes. The classes do NOT have to be
 * related.
 * Interfaces are NOT extended (extends).
 * Interfaces are implemented (implements).
 * 
 * Interfaces are pure 'contracts'.
 */
public interface Carryable {

	abstract void carryAround();
	
}
