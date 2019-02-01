package cabral.vinicius.sfgpetclinic.services;

import cabral.vinicius.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
