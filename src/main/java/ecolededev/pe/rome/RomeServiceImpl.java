package ecolededev.pe.rome;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by grenouille on 18/06/2017.
 */
@Service
public class RomeServiceImpl implements RomeService
{
        @Autowired
        RomeRepository romeRepository;
        @Override public List<Rome> loadAll()
        {
                List<Rome> romes = new ArrayList<>();
                Rome rome = new Rome("R1", "Rome 1");
                romes.add(rome);
                return romes;
                //return romeRepository.findAll();
        }
}
