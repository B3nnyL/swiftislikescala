for object in someObjects {
    if let movie = object as? Movie{
        print("Movie: '\(movie.name)', dir. \(movie.director)")
    } else if let song = object as? Song {
        print("Song: \(song.name), by \(song.artist)")
    }
}
