package cz.cvut.spipes.exception;

/**
 * Exception thrown when a resource is not found.
 *
 */

import java.util.Set;

/**
 *
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String entityId, Set<String> contextUris) {
        super("Resource identified by \"" + entityId + "\" was not found in contexts " + contextUris + ".");
    }

    public ResourceNotFoundException(String entityId, String contextUri) {
        super("Resource identified by \"" + entityId + "\" was not found in context \"" + contextUri + "\".");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}