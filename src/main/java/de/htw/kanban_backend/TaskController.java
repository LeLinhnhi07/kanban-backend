package de.htw.kanban_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getAllTasks() {
        return List.of(
                new Task("1", "M1 Abgabe vorbereiten", "GitHub Repo & GET Route aufsetzen", "IN_PROGRESS"),
                new Task("2", "Backend testen", "Endpoint im Browser aufrufen", "TODO")
        );
    }
}