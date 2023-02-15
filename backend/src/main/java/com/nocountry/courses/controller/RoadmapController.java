package com.nocountry.courses.controller;

import com.nocountry.courses.dto.request.RoadmapRequestDto;
import com.nocountry.courses.dto.response.RoadmapResponseDto;
import com.nocountry.courses.model.Roadmap;
import com.nocountry.courses.service.IRoadmapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roadmap")
public record RoadmapController(IRoadmapService service) {

    @PostMapping("/create")
    public ResponseEntity<RoadmapResponseDto> create(@RequestBody RoadmapRequestDto roadmap){
        return ResponseEntity.ok(service.create(roadmap));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<RoadmapResponseDto>> findAllByUserId(@PathVariable("userId") Long id){
        return ResponseEntity.ok(service.findAllByUserId(id));
    }
}