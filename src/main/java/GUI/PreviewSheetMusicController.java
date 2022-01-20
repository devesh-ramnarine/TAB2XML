package GUI;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PreviewSheetMusicController extends Application { 
  
	   private MainViewController mvc;
	
	@FXML public CodeArea mxlText;
	@FXML TextField gotoMeasureField;
	@FXML Button goToline;
	
	public PreviewSheetMusicController() {}
	
	
	
	
	@FXML 
	public void initialize() {
		mxlText.setParagraphGraphicFactory(LineNumberFactory.get(mxlText));
	}
	 public void setMainViewController(MainViewController mvcInput) {
	    	mvc = mvcInput;
	    }
	 public void update() {
			mxlText.replaceText(mvc.converter.getMusicXML());
			mxlText.moveTo(0);
			mxlText.requestFollowCaret();
	        mxlText.requestFocus();
		}
		@Override
		public void start(Stage primaryStage) throws Exception {}
}
