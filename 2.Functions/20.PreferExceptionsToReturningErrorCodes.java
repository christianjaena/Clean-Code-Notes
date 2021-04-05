/**
	PREFER EXCEPTIONS TO RETURNING ERROR CODES
*/

// Use try-catch blocks rather than deeply nested returning error codes
if (deletePage(page) == E_OK) {
	if (registry.deleteReference(page.name) == E_OK) {
		if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
			logger.log("page deleted");
		} else {
			logger.log("configKey not deleted");
		}
	} else {
		logger.log("delete failed");
		return E_ERROR;
	}
}

// try-catch blocks are much shorter to read
try {
	deletePage(page);
	registry.deleteReference(page.name);
	configKeys.deleteKey(page.name.makeKey());
} catch (Exception e) {
	logger.log(e.getMessage());
}