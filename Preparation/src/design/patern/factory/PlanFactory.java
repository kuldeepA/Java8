package design.patern.factory;

public class PlanFactory {

	public Plan getPlan(String sc) {
		
		if ("Domestic".equals(sc))
			return new Domestic();
		else if ("Comercial".equals(sc))
			return new Commercial();
		return null;
	}
}
