package at.ac.tuwien.big.me12.lab2.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

public class XtextExtractor {

	private final XtextResourceSet xtextResourceSet = new XtextResourceSet();

	public Resource extract(String filePath) {
		return extract(new File(filePath));
	}

	public Resource extract(File file) {
		Resource xTextResource = xtextResourceSet.getResource(
				URI.createFileURI(file.getAbsolutePath()), true);
		EcoreUtil.resolveAll(xTextResource);
		return xTextResource;
	}

}
