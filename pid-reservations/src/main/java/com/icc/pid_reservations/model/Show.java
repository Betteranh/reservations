package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "slug", length = 60)
    private String slug;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "poster_url", length = 255)
    private String posterUrl;

    @Column(name = "duration", nullable = true)
    private Integer duration;

    @Column(name = "created_in")
    private Integer createdIn;

    @Column(name = "bookable")
    private Boolean bookable;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "show")
    private List<Representation> representations;

    @OneToMany(mappedBy = "show")
    private List<ArtisteTypeShow> artisteTypeShows;

    protected Show() {
    }

    public Show(Integer id, String slug, String title, String posterUrl, Integer duration, Integer createdIn, Boolean bookable, Location location, List<Representation> representations, List<ArtisteTypeShow> artisteTypeShows) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.posterUrl = posterUrl;
        this.duration = duration;
        this.createdIn = createdIn;
        this.bookable = bookable;
        this.location = location;
        this.representations = representations;
        this.artisteTypeShows = artisteTypeShows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(Integer createdIn) {
        this.createdIn = createdIn;
    }

    public Boolean getBookable() {
        return bookable;
    }

    public void setBookable(Boolean bookable) {
        this.bookable = bookable;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Representation> getRepresentations() {
        return representations;
    }

    public void setRepresentations(List<Representation> representations) {
        this.representations = representations;
    }

    public List<ArtisteTypeShow> getArtisteTypeShows() {
        return artisteTypeShows;
    }

    public void setArtisteTypeShows(List<ArtisteTypeShow> artisteTypeShows) {
        this.artisteTypeShows = artisteTypeShows;
    }
}
