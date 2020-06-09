package org.dell.kube.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pages")
public class PageController {
    @Autowired
    private PagesRepository repository;
    public PageController()
    {
        //this.repository=pagesRepository;
    }
    @GetMapping
    public ResponseEntity<List<Page>> list(){

        return new ResponseEntity<List<Page>> (repository.findAll(),HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Page> getById(@PathVariable Long id){
        return new ResponseEntity<Page>(repository.getOne(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Page> create(@RequestBody Page page){
        return new ResponseEntity<Page>(repository.save(page),HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Page> update(@PathVariable Long id, @RequestBody Page page){
        if(repository.getOne(id) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        page.setId(id);
        return new ResponseEntity<Page>(repository.save(page),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        if(repository.getOne(id) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
