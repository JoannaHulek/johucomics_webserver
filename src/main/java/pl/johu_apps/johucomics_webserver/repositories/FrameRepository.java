package pl.johu_apps.johucomics_webserver.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.johu_apps.johucomics_webserver.data_representation.Frame;

@RepositoryRestResource(collectionResourceRel = "frame", path = "frame")
public interface FrameRepository extends PagingAndSortingRepository<Frame, Long>{
}
