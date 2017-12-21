package academy.elqoo.additional.dto;


public class DomainService {

    public DomainObjectDTO getData(){
        // assume backend service
        DomainObject domainObject = getObject();
        DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
        domainObjectDTO.setaProperty(domainObject.getaProperty());
        return domainObjectDTO;
    }

    private DomainObject getObject(){
        return new DomainObject();
    }

}
