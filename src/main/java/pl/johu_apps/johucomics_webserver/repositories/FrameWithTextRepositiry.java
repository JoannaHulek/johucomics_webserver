package pl.johu_apps.johucomics_webserver.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.johu_apps.johucomics_webserver.data_representation.FrameWithText;

@RepositoryRestResource(collectionResourceRel = "frameWithText", path = "frameWithText")
public interface FrameWithTextRepositiry extends PagingAndSortingRepository<FrameWithText, Long> {
}
