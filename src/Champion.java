import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public abstract class Champion {
    private String name;
    private String role;

    Property property;
    BodyInfo bodyinfo;
    Moving moving;

    Champion(String name, String role, String propertyName, int propertyPower, int maxHP, int maxMP, int one, int two, int maxMovingDistance) {
        this.name = name;
        this.role = role;

        property = new Property(propertyName, propertyPower);
        bodyinfo = new BodyInfo(maxHP, maxMP);
        moving = new Moving(one, two, maxMovingDistance);
    }

    public int getPropertyPower() {
        return property.getPropertyPower();
    }

    public String getName() {
        return name;
    }
}
