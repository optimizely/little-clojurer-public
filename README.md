# How to use this repo

Checkout a branch with your name:

```
git checkout [username]
```

Run tests with the `lein` command:

```
./lein test
```

They will fail. Your task is to make them pass.

Function definitions are located under `src/little_clojurer/`. Tests are
located under `test/little_clojurer/`. 

We will create a new file in these folders for each chapter of the Little Schemer.

# Chapter 1

For this chapter we will need to define the functions `cdr`, `null?` and `atom?`.

Note how we implment `car` by merely mapping it to `first`. You should be able to
find Clojure primitive functions that map to `cdr` and `null?`.  `atom?` is only
slightly more complicated.

# Merging to Master

Send a PR to Mustafa before merging to master. Feel free to push to your branch anytime.

## Leiningen

This repo uses [leiningen](http://leiningen.org/) to manage dependencies and the build process.

Leiningen is packaged with this repo under the file `lein` in the root directory. It's pretty cool.
