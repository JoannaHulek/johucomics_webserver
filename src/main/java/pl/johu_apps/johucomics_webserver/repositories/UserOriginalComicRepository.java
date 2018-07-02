package pl.johu_apps.johucomics_webserver.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.johu_apps.johucomics_webserver.data_representation.UserOriginalComic;

@RepositoryRestResource(collectionResourceRel = "userOriginalComicRepository")
public interface UserOriginalComicRepository extends PagingAndSortingRepository <UserOriginalComic, Long> {
}
