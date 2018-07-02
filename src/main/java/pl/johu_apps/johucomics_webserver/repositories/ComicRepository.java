package pl.johu_apps.johucomics_webserver.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.johu_apps.johucomics_webserver.data_representation.Comic;

@RepositoryRestResource(collectionResourceRel = "comic", path = "comic")
public interface ComicRepository extends PagingAndSortingRepository<Comic, Long>{



}
