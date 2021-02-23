import numpy as np
from sklearn.model_selection import train_test_split
from keras.models import Sequential
from keras.layers import Dense
from keras.optimizers import Adam


#load train data
x_train = np.loadtxt('./train_data.txt',skiprows=1, dtype=np.float32)
y_train = np.loadtxt('./train_truth.txt',skiprows=1, dtype=np.float32)

#create model
model = Sequential(name="my_sequential")


#create layer 
model.add(Dense(units=4,input_dim=3,kernel_initializer='uniform', activation='relu'))
model.add(Dense(units=4,kernel_initializer='uniform',activation='relu'))
model.add(Dense(units=1,kernel_initializer='uniform'))

#train
model.compile(loss='mean_squared_error', optimizer=Adam(lr=0.001))
train_history =model.fit(x=x_train, y=y_train, validation_split=0.2, epochs=300, batch_size=100,verbose=2)

#get predicted
x_test = np.loadtxt('./test_data.txt',skiprows=1, dtype=np.float32)
y_test =  model.predict(x_test,batch_size=100)
np.savetxt('test_predicted.txt', y_test)
