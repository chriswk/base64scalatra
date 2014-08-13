# Base64Fun #

## Build & Run ##

```sh
$ cd base64scalatra
$ ./sbt
> container:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Encode to base64
http://localhost:8080/encode?q=[STRINGTOENCODE]

## Decode from base64
http://localhost:8080/decode?q=[BASE64STRING]

## Encode to md5 (hex)
http://localhost:8080/md5?q=[STRINGTOENCODE]
