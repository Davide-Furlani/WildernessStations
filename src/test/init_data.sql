DELETE FROM MEASUREMENTS;
DELETE FROM STATION;

insert into STATION (ID, LATITUDE, LONGITUDE, NAME, STATE)
values (0, 45.376799, 10.792839, 'Sommacampagna', true),
       (1, 45.480101, 10.881819, 'Pescantina', true),
       (2, 45.465214, 10.846200, 'Bussolengo', false),
       (3, 45.510557, 10.513734, 'Padenghe sul Garda', true),
       (4, 45.245473, 11.123522, 'Bovolone', true),
       (5, 45.620762, 11.025609, 'Bosco Chiesanuova', true),
       (6, 45.000000, 11.000000, 'Basaglie', false),
       (7, 46.182832, 11.061096, 'Fai della Paganella', true),
       (8, 45.585223, 10.905406, 'Ca Gottolo', true),
       (9, 45.514760, 10.911766, 'San Floriano', true);


insert into MEASUREMENTS (ID, ATM_PRESSURE, TEMPERATURE, TIMESTAMP, WIND_SPEED, STATION_ID)
values (1, 993, 10, '2022-05-10 13:27:43', 0, 0),
       (2, 1035, 15, '2022-05-10 16:35:36', 5, 0),
       (3, 1033, 23, '2022-05-10 20:42:34', 1, 0),
       (4, 1024, 12, '2022-05-10 17:50:24', 5, 0),
       (5, 1029, 21, '2022-05-10 22:25:23', 6, 0),
       (6, 1035, 21, '2022-05-10 23:15:57', 6, 0),
       (7, 1011, 15, '2022-05-10 23:34:35', 2, 0),
       (8, 1027, 13, '2022-05-10 14:25:42', 6, 0),
       (9, 1016, 17, '2022-05-10 20:42:38', 6, 0),
       (10, 1029, 19, '2022-05-10 22:58:33', 1, 0),
       (11, 994, 18, '2022-05-10 16:40:16', 4, 1),
       (12, 1013, 20, '2022-05-10 23:37:10', 2, 1),
       (13, 1010, 21, '2022-05-10 10:31:14', 4, 1),
       (14, 1034, 11, '2022-05-10 12:34:27', 3, 1),
       (15, 1036, 11, '2022-05-10 17:29:24', 4, 1),
       (16, 1015, 12, '2022-05-10 17:19:59', 4, 1),
       (17, 1033, 17, '2022-05-10 22:12:50', 6, 1),
       (18, 1001, 13, '2022-05-10 10:45:20', 1, 1),
       (19, 1009, 20, '2022-05-10 15:34:50', 0, 1),
       (20, 1018, 13, '2022-05-10 18:31:48', 6, 1),
       (21, 1005, 25, '2022-05-10 17:34:43', 2, 2),
       (22, 1040, 17, '2022-05-10 11:54:37', 6, 2),
       (23, 1024, 20, '2022-05-10 23:17:32', 4, 2),
       (24, 1015, 21, '2022-05-10 21:36:32', 4, 2),
       (25, 1007, 21, '2022-05-10 14:43:35', 0, 2),
       (26, 1015, 12, '2022-05-10 17:18:34', 2, 2),
       (27, 1016, 23, '2022-05-10 21:31:33', 1, 2),
       (28, 992, 18, '2022-05-10 20:59:13', 3, 2),
       (29, 1025, 18, '2022-05-10 15:28:20', 0, 2),
       (30, 1032, 24, '2022-05-10 13:44:13', 2, 2),
       (31, 1024, 13, '2022-05-10 13:16:35', 5, 3),
       (32, 1019, 20, '2022-05-10 22:29:58', 3, 3),
       (33, 1011, 18, '2022-05-10 18:39:21', 3, 3),
       (34, 1028, 16, '2022-05-10 14:17:22', 4, 3),
       (35, 1017, 12, '2022-05-10 12:57:41', 4, 3),
       (36, 1010, 12, '2022-05-10 17:15:40', 5, 3),
       (37, 1004, 22, '2022-05-10 23:12:59', 6, 3),
       (38, 1035, 12, '2022-05-10 16:36:45', 1, 3),
       (39, 1010, 22, '2022-05-10 16:35:27', 3, 3),
       (40, 1005, 12, '2022-05-10 15:49:48', 1, 3),
       (41, 1024, 25, '2022-05-10 13:13:29', 2, 4),
       (42, 1022, 19, '2022-05-10 22:51:26', 3, 4),
       (43, 1019, 15, '2022-05-10 11:11:52', 6, 4),
       (44, 1028, 18, '2022-05-10 16:41:57', 3, 4),
       (45, 1021, 17, '2022-05-10 22:48:19', 3, 4),
       (46, 1014, 21, '2022-05-10 16:37:29', 3, 4),
       (47, 1011, 14, '2022-05-10 21:37:14', 3, 4),
       (48, 1003, 20, '2022-05-10 17:40:44', 4, 4),
       (49, 1023, 22, '2022-05-10 10:23:22', 3, 4),
       (50, 1037, 15, '2022-05-10 20:32:48', 1, 4),
       (51, 995, 11, '2022-05-10 11:57:29', 0, 5),
       (52, 1039, 20, '2022-05-10 19:53:13', 6, 5),
       (53, 1036, 10, '2022-05-10 12:32:49', 4, 5),
       (54, 1010, 13, '2022-05-10 15:22:26', 4, 5),
       (55, 1022, 17, '2022-05-10 20:28:38', 2, 5),
       (56, 1018, 14, '2022-05-10 18:48:44', 5, 5),
       (57, 1039, 14, '2022-05-10 14:35:40', 0, 5),
       (58, 1027, 18, '2022-05-10 13:26:17', 0, 5),
       (59, 1023, 11, '2022-05-10 17:47:11', 5, 5),
       (60, 1016, 20, '2022-05-10 20:14:58', 1, 5),
       (61, 1017, 15, '2022-05-10 12:45:15', 1, 6),
       (62, 1001, 22, '2022-05-10 11:51:39', 3, 6),
       (63, 999, 11, '2022-05-10 12:48:43', 1, 6),
       (64, 990, 12, '2022-05-10 18:50:35', 0, 6),
       (65, 1027, 14, '2022-05-10 12:29:54', 0, 6),
       (66, 1008, 12, '2022-05-10 17:43:55', 0, 6),
       (67, 999, 21, '2022-05-10 17:53:27', 1, 6),
       (68, 1034, 12, '2022-05-10 23:24:43', 0, 6),
       (69, 998, 10, '2022-05-10 10:39:10', 3, 6),
       (70, 1032, 24, '2022-05-10 10:43:14', 2, 6),
       (71, 1001, 20, '2022-05-10 12:31:39', 1, 7),
       (72, 995, 13, '2022-05-10 23:37:30', 2, 7),
       (73, 1000, 23, '2022-05-10 16:19:26', 6, 7),
       (74, 1018, 12, '2022-05-10 18:19:27', 6, 7),
       (75, 1021, 22, '2022-05-10 11:31:28', 1, 7),
       (76, 1036, 21, '2022-05-10 14:58:59', 4, 7),
       (77, 1011, 25, '2022-05-10 19:39:31', 6, 7),
       (78, 1017, 16, '2022-05-10 10:22:25', 6, 7),
       (79, 1040, 24, '2022-05-10 23:52:45', 4, 7),
       (80, 1039, 24, '2022-05-10 10:50:58', 4, 7),
       (81, 995, 20, '2022-05-10 21:40:33', 0, 8),
       (82, 1017, 17, '2022-05-10 12:29:55', 1, 8),
       (83, 991, 22, '2022-05-10 18:16:12', 5, 8),
       (84, 1014, 19, '2022-05-10 16:57:39', 5, 8),
       (85, 1032, 14, '2022-05-10 16:59:21', 6, 8),
       (86, 1009, 21, '2022-05-10 15:39:23', 6, 8),
       (87, 1016, 13, '2022-05-10 21:29:50', 5, 8),
       (88, 991, 10, '2022-05-10 14:32:46', 1, 8),
       (89, 995, 17, '2022-05-10 18:48:55', 2, 8),
       (90, 1011, 12, '2022-05-10 10:25:56', 5, 8),
       (91, 994, 11, '2022-05-10 14:11:26', 1, 9),
       (92, 1039, 25, '2022-05-10 14:20:32', 0, 9),
       (93, 1025, 16, '2022-05-10 19:34:47', 4, 9),
       (94, 1036, 17, '2022-05-10 17:39:16', 1, 9),
       (95, 1008, 25, '2022-05-10 16:36:11', 6, 9),
       (96, 1008, 15, '2022-05-10 20:10:10', 5, 9),
       (97, 993, 23, '2022-05-10 14:21:25', 2, 9),
       (98, 1030, 25, '2022-05-10 21:18:29', 4, 9),
       (99, 1038, 19, '2022-05-10 23:42:56', 3, 9),
       (100, 1034, 18, '2022-05-10 23:29:47', 5, 9);

--Drop table MEASUREMENTS;
--drop table STATION;