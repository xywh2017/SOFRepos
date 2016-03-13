/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

/**
 *
 * @author user
 */
public class PresentationBean {
    
     int presentationID;
     String presentationDay;
     String presentationStart;
     String presentationEnd;

    public int getPresentationID() {
        return presentationID;
    }

    public void setPresentationID(int presentationID) {
        this.presentationID = presentationID;
    }

    public String getPresentationDay() {
        return presentationDay;
    }

    public void setPresentationDay(String presentationDay) {
        this.presentationDay = presentationDay;
    }

    public String getPresentationStart() {
        return presentationStart;
    }

    public void setPresentationStart(String presentationStart) {
        this.presentationStart = presentationStart;
    }

    public String getPresentationEnd() {
        return presentationEnd;
    }

    public void setPresentationEnd(String presentationEnd) {
        this.presentationEnd = presentationEnd;
    }
    
   @Override
	public String toString() {
		String presentation = "PresentationDay: "+ getPresentationDay() + " PresentationStart: "+ getPresentationStart() + " PresentationEnd: "+ getPresentationEnd();
		return presentation;
	}
    
}
