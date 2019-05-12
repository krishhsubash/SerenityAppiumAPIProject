package xmlConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Environments")
public class Environments {

    @XmlElement(name = "Environment", type = xmlConfig.Environment.class)
    private List<xmlConfig.Environment> models = new ArrayList<xmlConfig.Environment>();

    public Environments(List<xmlConfig.Environment> models) {
        this.models = models;
    }

    public List<xmlConfig.Environment> getEnvironments() {
        return models;
    }

    public void setEnvironments(List<xmlConfig.Environment> models) {
        this.models = models;
    }

}