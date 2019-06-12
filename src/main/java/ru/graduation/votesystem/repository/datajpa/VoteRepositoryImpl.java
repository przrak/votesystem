package ru.graduation.votesystem.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.graduation.votesystem.model.Menu;
import ru.graduation.votesystem.model.Vote;
import ru.graduation.votesystem.repository.VoteRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

@Repository
public class VoteRepositoryImpl implements VoteRepository {

//    @PersistenceContext
//    private EntityManager em;

    @Autowired
    private CrudVoteRepository crudRepository;

    @Override
    public Vote save(Vote vote) {
        return crudRepository.save(vote);
    }

    @Override
    public Vote getByUserIdAndDate(LocalDate date, int userId) {
        return crudRepository.getByUserIdAndDate(date, userId);
    }

    @Override
    public List<Vote> getAllByDate(LocalDate date) {
        return crudRepository.getAllByDate(date);
    }
}
