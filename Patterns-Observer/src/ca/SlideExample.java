package ca;

public class SlideExample {
    class UiThreatList {
        public void notifyNewAnalysis() {
        }
    };

    class UiThreatLocations{
        public void notifyNewAnalysis() {

        }
    };
    class UiThreatLatest{
        public void notifyNewAnalysis() {
            ThreatModel t = new ThreatModel();
            t.notifyUiOfNewAnalysis();
        }
    };

class ThreatModel {
    private UiThreatList uiList;
    private UiThreatLocations uiLocations;
    private UiThreatLatest uiLatest;

    public void notifyUiOfNewAnalysis() {
        uiList.notifyNewAnalysis();
        uiLocations.notifyNewAnalysis();
        uiLatest.notifyNewAnalysis();
    }
}
}
