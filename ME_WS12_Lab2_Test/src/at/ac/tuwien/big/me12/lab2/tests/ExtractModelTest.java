package at.ac.tuwien.big.me12.lab2.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class ExtractModelTest {

	private static final String MODEL_PATH = "gsml-models/";
	private static final String INPUT_MODEL_PATH_1 = MODEL_PATH + "test1.gsml";
	private static final String OUTPUT_MODEL_PATH_1 = MODEL_PATH + "test1.xmi";
	private static final String INPUT_MODEL_PATH_2 = MODEL_PATH + "test2.gsml";
	private static final String OUTPUT_MODEL_PATH_2 = MODEL_PATH + "test2.xmi";

	private final XtextExtractor extractor = new XtextExtractor();
	private final ResourceSet emfResourceSet = new ResourceSetImpl();

	@Test
	public void extractTest1Model() throws IOException {
		extractModel(INPUT_MODEL_PATH_1, OUTPUT_MODEL_PATH_1);
	}
	
	@Test
	public void extractTest2Model() throws IOException {
		extractModel(INPUT_MODEL_PATH_2, OUTPUT_MODEL_PATH_2);
	}

	private void extractModel(String input, String output) throws IOException {
		Resource xTextResource = extractor.extract(input);

		String absolutePath = new File(output).getAbsolutePath();
		URI modelFileURI = URI.createFileURI(absolutePath);

		saveContentsToModel(xTextResource, modelFileURI);
	}

	private void saveContentsToModel(Resource contents, URI modelFileURI)
			throws IOException {
		Resource emfResource = emfResourceSet.createResource(modelFileURI);
		emfResource.getContents().addAll(contents.getContents());
		emfResource.save(null);
	}

}
