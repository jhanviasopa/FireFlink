package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.pdf.PDFParserConfig;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadPdf {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		// TODO Auto-generated method stub
        BodyContentHandler content = new BodyContentHandler();
        FileInputStream file = new FileInputStream("./src/test/resource/TestData/JHANVI-Resume.pdf");
        Metadata metadata = new Metadata();
        ParseContext parseContext = new ParseContext();
        PDFParser paeser = new PDFParser();
        paeser.parse(file, content, metadata, parseContext);
        System.out.println(content.toString());
	}

}
