# MockDataGenerator
This project is created to generate mock transactional data required for our project.

The whole intension of this project is to create a executable jar file where we can pass 3 arguments to generate different sample data specific to CardDetails/Product/Store/TransactionData.

Main method expects 3 arguments as follow:

- First argument is output path i.e. the complete filesystem path where you want to store output data. For Eg.: /usr/local/hadoop/data/output/
- Second argument is the partial name of the class. The output files will be generated with these names. It can be CardDetails/Product/Store/TransactionData.
- Third argument is the number of file that you want to generate.
@Example of the arguments passed: /usr/local/hadoop/data/output/ CardDetail 3
Here,
  - "/usr/local/hadoop/data/output/" is the output directory
  - "CardDetail" is the partial name of class that generate data related to Credit cards.
  - "3" is the number of files to be generated. 
