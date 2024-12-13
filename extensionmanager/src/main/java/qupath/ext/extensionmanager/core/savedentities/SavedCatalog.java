package qupath.ext.extensionmanager.core.savedentities;

import qupath.ext.extensionmanager.core.catalog.Catalog;

import java.net.URI;

/**
 * Basic metadata on a catalog.
 *
 * @param name see {@link Catalog#name()}
 * @param description see {@link Catalog#description()}
 * @param uri a URI pointing to the raw content of the catalog, or to a GitHub repository where the
 *            catalog can be found
 * @param rawUri the URI pointing to the raw content of the catalog (can be same as {@link #uri})
 * @param deletable whether this metadata can be deleted
 */
public record SavedCatalog(String name, String description, URI uri, URI rawUri, boolean deletable) {}
