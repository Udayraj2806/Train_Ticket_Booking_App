package trainticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSeatDto {
    Integer trainId;
    String userName;
    Integer seats;

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "BookSeatDto{" +
                "trainId=" + trainId +
                ", userName='" + userName + '\'' +
                ", seats=" + seats +
                '}';
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
