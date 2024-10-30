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
array.reshape / này dùng nhiều -> trả về mảng ban đầu -> pass và -1 đỡ phải tính -> reshape(-1) ép thảng

#loop through array

