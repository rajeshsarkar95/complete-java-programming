# 12 — JDBC

JDBC connects Java applications to relational databases. Typical steps:
1. Add the database vendor's JDBC driver to the project.
2. Open a `Connection`.
3. Use `PreparedStatement` with parameters.
4. Process the `ResultSet`.
5. Close resources with try-with-resources.

Never concatenate untrusted input into SQL. The example is a template; configure a real driver and database before running.
