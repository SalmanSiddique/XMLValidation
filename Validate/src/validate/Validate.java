/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import javax.xml.validation.SchemaFactory;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.XMLReader;
import java.io.File;

/**
 *
 * @author Salman
 */
public final class Validate {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try
        {
        System.out.println(args[0]);
        SAXParserFactory factory = SAXParserFactory.newInstance();
	factory.setValidating(false);
	factory.setNamespaceAware(true);
	SchemaFactory schemaFactory =  SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
	factory.setSchema(schemaFactory.newSchema(new File("library.xsd")));
	XMLReader xmlReader = factory.newSAXParser().getXMLReader();
	xmlReader.parse("p5.xml");
        }
        catch(Exception e)  
        {
            System.out.println(e.getMessage());
        }
    }
    
}
