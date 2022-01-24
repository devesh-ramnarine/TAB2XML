package parser;

import javax.xml.parsers.*;
import org.xml.sax.InputSource;

import org.w3c.dom.*;
import java.io.*;

public class ParseXmlString {
	
	public ParseXmlString() {
		
	}

	public static void main(String[] args) {

		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n"
				+ "<!DOCTYPE score-partwise PUBLIC \"-//Recordare//DTD MusicXML 3.1 Partwise//EN\" \"http://www.musicxml.org/dtds/partwise.dtd\">\n"
				+ "<score-partwise version=\"3.1\">\n"
				+ "  <identification>\n"
				+ "    <creator type=\"composer\"></creator>\n"
				+ "  </identification>\n"
				+ "  <part-list>\n"
				+ "    <score-part id=\"P1\">\n"
				+ "      <part-name>Guitar</part-name>\n"
				+ "    </score-part>\n"
				+ "  </part-list>\n"
				+ "  <part id=\"P1\">\n"
				+ "    <measure number=\"1\">\n"
				+ "      <attributes>\n"
				+ "        <divisions>16</divisions>\n"
				+ "        <key>\n"
				+ "          <fifths>0</fifths>\n"
				+ "        </key>\n"
				+ "        <clef>\n"
				+ "          <sign>TAB</sign>\n"
				+ "          <line>5</line>\n"
				+ "        </clef>\n"
				+ "        <staff-details>\n"
				+ "          <staff-lines>6</staff-lines>\n"
				+ "          <staff-tuning line=\"1\">\n"
				+ "            <tuning-step>E</tuning-step>\n"
				+ "            <tuning-octave>2</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "          <staff-tuning line=\"2\">\n"
				+ "            <tuning-step>A</tuning-step>\n"
				+ "            <tuning-octave>2</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "          <staff-tuning line=\"3\">\n"
				+ "            <tuning-step>D</tuning-step>\n"
				+ "            <tuning-octave>3</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "          <staff-tuning line=\"4\">\n"
				+ "            <tuning-step>G</tuning-step>\n"
				+ "            <tuning-octave>3</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "          <staff-tuning line=\"5\">\n"
				+ "            <tuning-step>B</tuning-step>\n"
				+ "            <tuning-octave>3</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "          <staff-tuning line=\"6\">\n"
				+ "            <tuning-step>E</tuning-step>\n"
				+ "            <tuning-octave>4</tuning-octave>\n"
				+ "          </staff-tuning>\n"
				+ "        </staff-details>\n"
				+ "      </attributes>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>2</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>6</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>B</step>\n"
				+ "          <octave>2</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>5</string>\n"
				+ "            <fret>2</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>4</string>\n"
				+ "            <fret>2</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>G</step>\n"
				+ "          <alter>1</alter>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>3</string>\n"
				+ "            <fret>1</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>B</step>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>2</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>4</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>1</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>B</step>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>2</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>G</step>\n"
				+ "          <alter>1</alter>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>8</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>eighth</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>3</string>\n"
				+ "            <fret>1</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "    </measure>\n"
				+ "    <measure number=\"2\">\n"
				+ "      <attributes>\n"
				+ "        <divisions>16</divisions>\n"
				+ "        <key>\n"
				+ "          <fifths>0</fifths>\n"
				+ "        </key>\n"
				+ "      </attributes>\n"
				+ "      <note>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>4</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>1</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <chord/>\n"
				+ "        <pitch>\n"
				+ "          <step>B</step>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>2</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <chord/>\n"
				+ "        <pitch>\n"
				+ "          <step>G</step>\n"
				+ "          <alter>1</alter>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>3</string>\n"
				+ "            <fret>1</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <chord/>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>3</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>4</string>\n"
				+ "            <fret>2</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <chord/>\n"
				+ "        <pitch>\n"
				+ "          <step>B</step>\n"
				+ "          <octave>2</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>5</string>\n"
				+ "            <fret>2</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "      <note>\n"
				+ "        <chord/>\n"
				+ "        <pitch>\n"
				+ "          <step>E</step>\n"
				+ "          <octave>2</octave>\n"
				+ "        </pitch>\n"
				+ "        <duration>64</duration>\n"
				+ "        <voice>1</voice>\n"
				+ "        <type>whole</type>\n"
				+ "        <notations>\n"
				+ "          <technical>\n"
				+ "            <string>6</string>\n"
				+ "            <fret>0</fret>\n"
				+ "          </technical>\n"
				+ "        </notations>\n"
				+ "      </note>\n"
				+ "    </measure>\n"
				+ "  </part>\n"
				+ "</score-partwise>\n"
				+ "\n";


		try {
			//making the DOC
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			//used as an input for dBuilder.parse() instead of inputting a file
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xmlString));

			//input is
			Document doc = dBuilder.parse(is);

			//better Visual 
			doc.getDocumentElement().normalize();
			
//			----------------------------------------------------------------------------------------------------------------------------
			
			
//			NodeList nodeList1 = doc.getElementsByTagName("score-partwise");
//			
//			ParseXmlString parser = new ParseXmlString();
//			
//			for(int i = 0; i < nodeList1.getLength(); i++) {
//				parser.printChild(nodeList1.item(i));
//			}
			
//			----------------------------------------------------------------------------------------------------------------------------
//			THIS IS THE WAY I FOUND WORKS BEST 
			
			
			//get all nodes in doc
			NodeList nodesList1 = doc.getElementsByTagName("*");
			
			//iterate and print nodes
			for (int i = 0; i < nodesList1.getLength(); i++) {
				Node node = nodesList1.item(i);

				Element element = (Element) node;
				System.out.println(element.getNodeName());
				
				String name = element.getAttribute("name");
				System.out.println(name);
			}
			
//			----------------------------------------------------------------------------------------------------------------------------

//			//get root element and print
//			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

//			//create a list of the nodes with same tag name
//			NodeList nodeList1 = doc.getE

			System.out.println("----------------------------");
			
//			for(int i = 0; i < nodeList1.getLength(); i++) {
//				NodeList childNodesList1 = nodeList1.item(i).getChildNodes();
//				
//				
//			}
			
			
//--------------------------------------------------------------------------------------------------------------------------------------			
			
				

//			for (int i = 0; i < nodeList1.getLength(); i++) {
//				Node node1 = nodeList1.item(i);
//				System.out.println("Current Element :" + node1.getNodeName());
//
//				if (node1.getNodeType() == Node.ELEMENT_NODE) {
//					Element eElement = (Element) node1;
//					System.out.println("Student roll no : " 
//							+ eElement.getAttribute("rollno"));
//					System.out.println("First Name : " 
//							+ eElement
//							.getElementsByTagName("firstname")
//							.item(0)
//							.getTextContent());
//					System.out.println("Last Name : " 
//							+ eElement
//							.getElementsByTagName("lastname")
//							.item(0)
//							.getTextContent());
//					System.out.println("Nick Name : " 
//							+ eElement
//							.getElementsByTagName("nickname")
//							.item(0)
//							.getTextContent());
//					System.out.println("Marks : " 
//							+ eElement
//							.getElementsByTagName("marks")
//							.item(0)
//							.getTextContent());
//				}
//			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

//		--------------------------------------------------------------------------------------------------------------------------------
		
		
//		try {
//			DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
//			DocumentBuilder db = dbf.newDocumentBuilder();
//			InputSource is = new InputSource();
//			is.setCharacterStream(new StringReader(xmlString));
//
//			Document doc = db.parse(is);
//			NodeList nodes = doc.getElementsByTagName("part");
//
//			for (int i = 0; i < nodes.getLength(); i++) {
//				Element element = (Element) nodes.item(i);
//
//				NodeList name = element.getElementsByTagName("name");
//				Element line = (Element) name.item(0);
//				System.out.println("Name: " + getCharacterDataFromElement(line));
//
//				NodeList title = element.getElementsByTagName("title");
//				line = (Element) title.item(0);
//				System.out.println("Title: " + getCharacterDataFromElement(line));
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}


		/*
    output :
        Name: John
        Title: Manager
        Name: Sara
        Title: Clerk
		 */    

	}
	
//	public void printChild(Node node) {
//	    NodeList childNodes = node.getChildNodes();
//	    System.out.println("Node: " + node.getNodeType() + ", " + node.getLocalName());
//	    
//	    for(int i = 0; i < childNodes.getLength(); i++) {
//	        Node childNode = childNodes.item(i);
//	        
//	        if(childNode.hasAttributes()) {
//	            System.out.println("Attributes: " + childNode.getAttributes()); //just an example...
//	            //Here you can iterate over each attributes to do something
//	        }
//
//	        if(childNode.hasChildNodes()) {
//	            System.out.println(""); //just an empty string
//	            printChild(childNode);
//	        }
//	    }
//	}

//	public static String getCharacterDataFromElement(Element e) {
//		Node child = e.getFirstChild();
//		if (child instanceof CharacterData) {
//			CharacterData cd = (CharacterData) child;
//			return cd.getData();
//		}
//		return "?";
//	}
}
