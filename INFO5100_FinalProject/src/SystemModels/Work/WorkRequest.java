/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author kalle
 */
    

public abstract class WorkRequest {

    private String id;
    private LocalDateTime requestDate;
    private LocalDateTime resolveDate;
    private RequestStatus status;
    
    public enum RequestStatus {
        ASSIGNED,
        ONGOING,
        COMPLETED
    }
    
    
    public WorkRequest(){
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.requestDate = LocalDateTime.now();
        this.status = RequestStatus.ASSIGNED;
    }

    public String getId() {
        return id;
    }


    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDateTime getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(LocalDateTime resolveDate) {
        this.resolveDate = resolveDate;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }
    
    
}
