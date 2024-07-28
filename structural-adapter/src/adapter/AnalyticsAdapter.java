package adapter;

public class AnalyticsAdapter implements IRestaurant {

	private Analytics analytics;

	public AnalyticsAdapter() {
		super();
		this.analytics = new Analytics();
	}

	@Override
	public void displayMenus(XmlData xmlData) {
		System.out.println("converting xml to json");
		Json json = convertXmlTOJson(xmlData);
		analytics.displayMenus(json);
	}

	private Json convertXmlTOJson(XmlData xmlData) {
		// TODO Auto-generated method stub
		return new Json();
	}

}
