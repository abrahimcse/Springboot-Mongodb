package com.abrahim.bookauthor.controller;

import com.abrahim.bookauthor.model.Author;
import com.abrahim.bookauthor.model.Book;
import com.abrahim.bookauthor.model.Member;
import com.abrahim.bookauthor.model.request.AuthorCreationRequest;
import com.abrahim.bookauthor.model.request.BookCreationRequest;
import com.abrahim.bookauthor.model.request.BookLendRequest;
import com.abrahim.bookauthor.model.request.MemberCreationRequest;
import com.abrahim.bookauthor.service.LibraryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/library")
@RequiredArgsConstructor
public class LibraryController {

  private final LibraryService libraryService;

  @PostMapping("/book")
  public ResponseEntity<Book> createBook(@RequestBody BookCreationRequest request) {
    return ResponseEntity.ok(libraryService.createBook(request));
  }

  @GetMapping("/books")
  public ResponseEntity readBooks(@RequestParam(required = false) String isbn) {
    if (isbn == null) {
      return ResponseEntity.ok(libraryService.readBooks());
    }
    return ResponseEntity.ok(libraryService.readBook(isbn));
  }

  @GetMapping("/book/{bookId}")
  public ResponseEntity<Book> readBook(@PathVariable String bookId) {
    return ResponseEntity.ok(libraryService.readBookById(bookId));
  }

  @DeleteMapping("/book/{bookId}")
  public ResponseEntity<Void> deleteBook(@PathVariable String bookId) {
    libraryService.deleteBook(bookId);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/member")
  public ResponseEntity<Member> createMember(@RequestBody MemberCreationRequest request) {
    return ResponseEntity.ok(libraryService.createMember(request));
  }

  @PatchMapping("/member/{memberId}")
  public ResponseEntity<Member> updateMember(@RequestBody MemberCreationRequest request,
      @PathVariable String memberId) {
    return ResponseEntity.ok(libraryService.updateMember(memberId, request));
  }

  @PostMapping("/book/lend")
  public ResponseEntity<List<String>> lendABook(@RequestBody BookLendRequest request) {
    return ResponseEntity.ok(libraryService.lendABook(request));
  }

  @PostMapping("/author")
  public ResponseEntity<Author> createAuthor(@RequestBody AuthorCreationRequest request) {
    return ResponseEntity.ok(libraryService.createAuthor(request));
  }
}
