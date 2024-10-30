#create an array:
arr = np.narray([1,2,3]) / (1,2,3) / Tuples is OK too
arr = np.array([[2],[4]])

#array datatype:
i - integer
f - float
c - complex
S - string
O - Object

arr = np.array([1,2,3], dtype = 'i8')
print(arr.dtype)

#array - reference/ copy
arr.copy() / make a copy
print(arr.base) / NOT A BASE

arr.view() / make a reference
print(arr.base) / RETURN ORIGINAL ARRAY

#array shape
array.ndim
array.shape
array.reshape / này dùng nhiều -> TRỎ về MẢNG BAN ĐÂU -> pass và -1 đỡ phải tính -> reshape(-1) ép thảng

#loop through array
//loop qua array cùng datatype
for x in np.nditer(array):
  print(x)

//loop qua array và đổi datatype
//NumPy không trực tiếp đổi datatype của elemt (trong mảng) nên cần không gian, gọi buffer, để enable nditer() dùng cớ flags=['buffered'].
for x in np.nditer(arr, flags = ['buffered'], os_dtypes = ['S']):
  print(x)

#join 2 array np.concatenate(arr1, arr2)
sử dụng axis để concat ~ None, 0 , 1 , n -> được tổ chức theo zyx nên axis = 0 là theo z, axis = 1 là theo y và axis = 2 là theo x
np.concatenate(arr1, arr2, axis = None) // 

#search array np.where(value == a)
arr = np.array([1, 2, 3, 4, 5, 4, 4])
x = np.where(arr == 4) // trả về index của value = 4

#sort array np.sort(array)
arr = np.array(['banana', 'cherry', 'apple'])
print(np.sort(arr))

#filter array
1.filter_array = []
for x in arr:
  if(condition) filter_array.append("True")
  else filter_array.append("False")
new_arr = arr[filter_array]
2.filter_array = arr % 2 == 0
new_arr = arr[filter_array]
