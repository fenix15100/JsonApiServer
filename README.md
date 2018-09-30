# JsonApiServer
Rest [JSON API](http://jsonapi.org/) 1.0 implemented with Elide.io & Dropwizard (Jetty+Jersey+Hibernate)

# How to use

1. Install and start a MySQL server

2. Create ```academicdb``` database

        mysql> create database academicdb;
    Can change user and password y app.yml file



4. Launch the example webservice

        ~/dropwizard-elide $ mvn install
        ~/dropwizard-elide $ cd dropwizard-elide-example
        ~/dropwizard-elide/dropwizard-elide-example $ java -jar target/dropwizard-elide-example-1.0-SNAPSHOT.jar server example.yml

5. Create an author

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "-",
            "type": "author",
            "attributes": {
              "name": "Ernest Hemingway"
            }
          }
        }' -X POST http://localhost:8080/author

6. Create a book

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "-",
            "type": "book",
            "attributes": {
              "title": "The Old Man and the Sea",
              "genre": "Literary Fiction",
              "language": "English"
            }
          }
        }' -X POST http://localhost:8080/book

7. Associate the author and book

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "1",
            "type": "author"
          }
        }' -X PATCH http://localhost:8080/book/1/relationships/authors

8. Get books

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' http://localhost:8080/book/

You can also load some pre-configured authors and books using `load_elide.sh` in `/scripts` 
