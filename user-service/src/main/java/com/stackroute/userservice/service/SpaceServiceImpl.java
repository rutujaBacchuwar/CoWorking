package com.stackroute.userservice.service;

import com.stackroute.kafka.domain.Space;
import com.stackroute.userservice.exception.SpaceAlreadyExistException;
import com.stackroute.userservice.exception.SpaceNotFound;
import com.stackroute.userservice.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {


    SpaceRepository spaceRepository;

    @Autowired
    public SpaceServiceImpl(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    @Override
    public Space saveSpace(Space space) throws SpaceAlreadyExistException {
        if(spaceRepository.existsById(space.getSpaceId())){
            throw new SpaceAlreadyExistException("Space Already Exist Exception");

        }
        return spaceRepository.save(space);
    }

    @Override
    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }

    @Override
    public Space update(Space space) throws SpaceNotFound {
        if(spaceRepository.existsById(space.getSpaceId())) {
            return spaceRepository.save(space);
        }
        throw new SpaceNotFound("Space not Found exception occured");
    }

    @Override
    public List<Space> deleteSpace(int spaceId) throws SpaceNotFound{
        if(spaceRepository.existsById(spaceId)) {
            spaceRepository.deleteById(spaceId);
            return spaceRepository.findAll();
        }
        throw new SpaceNotFound("Track not Found exception occured");

    }
    @Override
    public List<Space> findByName(String name)  {

        return spaceRepository.findByName(name);
    }


}
