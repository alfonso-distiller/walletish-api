package dist.examples.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dist.examples.petclinic.model.Owner;
import dist.examples.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object, object.getId());
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		throw new UnsupportedOperationException("Yet to be implemented");
	}

}
