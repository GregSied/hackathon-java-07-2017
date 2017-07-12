package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by 8760w on 2017-07-12.
 */
public interface JobRepository extends CrudRepository<Job, Long> {

    Job findById(Long id);

    List<Job> findByName(String name);

    @Query("select j from job where j.[name] like %?1%")
    public List<Job> getByNameLike(String search);

}
