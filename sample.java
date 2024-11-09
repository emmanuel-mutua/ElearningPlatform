// 1. Set Up the Borrowing Model

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowedBook {
    private Long bookId;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    // Initialize with borrow date and set due date to 2 weeks later
    public BorrowedBook(Long bookId, LocalDate borrowDate) {
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(14); // 2-week borrowing period
    }

    // Getter and Setter methods
    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public Long getBookId() {
        return bookId;
    }
}

// 2. Step 2: Calculate Remaining Days in a Service Method

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowingService {

    public long getDaysRemaining(BorrowedBook borrowedBook) {
        LocalDate currentDate = LocalDate.now();
        
        // Calculate days remaining until the due date
        if (currentDate.isBefore(borrowedBook.getDueDate())) {
            return ChronoUnit.DAYS.between(currentDate, borrowedBook.getDueDate());
        } else {
            return 0; // Book is overdue
        }
    }
}


// 3. Step 3: Create an API Endpoint to Check Countdown

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrowed-books")
public class BorrowedBookController {

    @Autowired
    private BorrowingService borrowingService;

    @GetMapping("/{bookId}/days-remaining")
    public DaysRemainingResponse getDaysRemaining(@PathVariable Long bookId) {
        BorrowedBook borrowedBook = findBorrowedBookById(bookId); // Retrieve from DB or other storage
        long daysRemaining = borrowingService.getDaysRemaining(borrowedBook);
        
        return new DaysRemainingResponse(daysRemaining);
    }
    
    // Mock method to retrieve book (replace with actual DB logic)
    private BorrowedBook findBorrowedBookById(Long bookId) {
        // Assuming book was borrowed two days ago for example
        return new BorrowedBook(bookId, LocalDate.now().minusDays(2));
    }
}

class DaysRemainingResponse {
    private long daysRemaining;

    public DaysRemainingResponse(long daysRemaining) {
        this.daysRemaining = daysRemaining;
    }

    public long getDaysRemaining() {
        return daysRemaining;
    }
}


//4 . test GET /api/borrowed-books/{bookId}/days-remaining) 



  
