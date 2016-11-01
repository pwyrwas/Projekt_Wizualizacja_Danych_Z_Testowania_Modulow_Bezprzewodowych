/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;


import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import projekt_pp.module;

/**
 *
 * @author user
 */
public class xmlFile {
    /**
     *  Funkcja Tworząca na poczatku plik XML z parametrami komunikacji
     */
    private static DocumentBuilder dBuilder;
    private static DocumentBuilderFactory dbFactory;
    private static File fXmlFile;
    private static String path;
    public  static String Imie;
    
  public ArrayList<module> loadParametersFromXml(){
    ArrayList<module> arr = new ArrayList<module>(); 
        try {
        
        File file = new File("C:\\Users\\pwyrw\\Desktop\\Projekt_PP\\konfiguracja.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();

        
        NodeList nodeLst = doc.getElementsByTagName("Module");

        for (int s = 0; s < nodeLst.getLength(); s++) {

            Node fstNode = nodeLst.item(s);

            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                Element fstElmnt = (Element) fstNode;

                NodeList modeElmntLst = fstElmnt.getElementsByTagName("Mode");
                Element modeElmnt = (Element) modeElmntLst.item(0);
                NodeList mode = modeElmnt.getChildNodes();

                NodeList devIDElmntLst = fstElmnt.getElementsByTagName("deviceID");
                Element devIDElmnt = (Element) devIDElmntLst.item(0);
                NodeList devID = devIDElmnt.getChildNodes();

                NodeList chanelElmntLst = fstElmnt.getElementsByTagName("chanel");
                Element chanelElmnt = (Element) chanelElmntLst.item(0);
                NodeList chanel = chanelElmnt.getChildNodes();
                 
                // dodanie wszystkich informacji do ArrayList<module> arr
                arr.add(new module(fstElmnt.getAttribute("Name"), ((Node) devID.item(0)).getNodeValue(), 
                        ((Node) mode.item(0)).getNodeValue(), ((Node) chanel.item(0)).getNodeValue() ) );
                
                }            
         }
        return arr;
       } catch (Exception e) {
            e.printStackTrace();
       }
       return null;
}
  
    public void createXMLFile(){
        /*// Tworzenie pliku XML z konfiguracją poszczególnych modółów komunikacji bezprzewodowej*/
        try {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("communicationParameter");
		doc.appendChild(rootElement);
                
                //LoRa
		// Moduł komunikacyjny
		Element module1 = doc.createElement("Module");
                rootElement.appendChild(module1);
                module1.setAttribute("id", "1");
                module1.setAttribute("Name", "LoRa");
                         
                // Tryb pracy
		Element mode1 = doc.createElement("Mode");
                mode1.appendChild(doc.createTextNode("Nadajnik"));
		module1.appendChild(mode1);
                
                // ID urządzenia
		Element deviceID1 = doc.createElement("deviceID");
                deviceID1.appendChild(doc.createTextNode("1"));
		module1.appendChild(deviceID1);
                
                // Kanał komunikacji
		Element chanel1 = doc.createElement("chanel");
                chanel1.appendChild(doc.createTextNode("1"));
		module1.appendChild(chanel1);
                
                //ZigBee
                Element module2 = doc.createElement("Module");
                rootElement.appendChild(module2);
                module2.setAttribute("id", "2");
                module2.setAttribute("Name", "ZigBee");
                         
                // Tryb pracy
		Element mode2 = doc.createElement("Mode");
                mode2.appendChild(doc.createTextNode("Nadajnik"));
		module2.appendChild(mode2);
                
                // ID urządzenia
		Element deviceID2 = doc.createElement("deviceID");
                deviceID2.appendChild(doc.createTextNode("1"));
		module2.appendChild(deviceID2);
                
                // Kanał komunikacji
		Element chanel2 = doc.createElement("chanel");
                chanel2.appendChild(doc.createTextNode("1"));
		module2.appendChild(chanel2);
                
                //MiWi
                Element module3 = doc.createElement("Module");
                rootElement.appendChild(module3);
                module3.setAttribute("id", "3");
                module3.setAttribute("Name", "MiWi");
                         
                // Tryb pracy
		Element mode3 = doc.createElement("Mode");
                mode3.appendChild(doc.createTextNode("Nadajnik"));
		module3.appendChild(mode3);
                
                // ID urządzenia
		Element deviceID3 = doc.createElement("deviceID");
                deviceID3.appendChild(doc.createTextNode("1"));
		module3.appendChild(deviceID3);
                
                // Kanał komunikacji
		Element chanel3 = doc.createElement("chanel");
                chanel3.appendChild(doc.createTextNode("1"));
		module3.appendChild(chanel3);
                
                //nRF24L14
                Element module4 = doc.createElement("Module");
                rootElement.appendChild(module4);
                module4.setAttribute("id", "4");
                module4.setAttribute("Name", "nRF24L14");
                         
                // Tryb pracy
		Element mode4 = doc.createElement("Mode");
                mode4.appendChild(doc.createTextNode("Nadajnik"));
		module4.appendChild(mode4);
                
                // ID urządzenia
		Element deviceID4 = doc.createElement("deviceID");
                deviceID4.appendChild(doc.createTextNode("1"));
		module4.appendChild(deviceID4);
                
                // Kanał komunikacji
		Element chanel4 = doc.createElement("chanel");
                chanel4.appendChild(doc.createTextNode("1"));
		module4.appendChild(chanel4);
                
                // write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
                fXmlFile = new File("C:\\Users\\pwyrw\\Desktop\\Projekt_PP\\konfiugracja.xml");
		StreamResult result = new StreamResult(fXmlFile);
		transformer.transform(source, result);

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
    }
    
}
