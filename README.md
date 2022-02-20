# S-99 with Scala3

Solve http://aperiodic.net/phil/scala/s-99/ with Scala3.

## Index

- Working with lists
- Arithmetic
- Logic and Codes
- Binary Trees
- Multiway Trees
- Graphs
- Miscellaneous Problems

## Commands

```bash
# Go to workspace
$ docker-compose up -d
$ docker-compose exec scala bash
root@XXXXXXXXXXXX:~# cd /work/
root@XXXXXXXXXXXX:/work#

# Run the test
root@XXXXXXXXXXXX:/work# sbt test

# Run the formatter
root@XXXXXXXXXXXX:/work# sbt clean scalafmtSbt scalafmtAll

# Check the format
root@XXXXXXXXXXXX:/work# sbt clean scalafmtSbtCheck scalafmtCheckAll
```
