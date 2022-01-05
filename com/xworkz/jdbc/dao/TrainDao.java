package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.dto.TrainDto;
import com.xworkz.jdbc.util.TrainUtil;

public class TrainDao {
	public boolean save(TrainDto dto) {
		Connection connection = null;
		int row = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "insert into train values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dto.getId());
			preparedStatement.setObject(2, dto.getTrainNo());
			preparedStatement.setObject(3, dto.getBoarding());
			preparedStatement.setObject(4, dto.getDestination());
			preparedStatement.setObject(5, dto.getSeatNo());
			preparedStatement.setObject(6, dto.getPrice());
			preparedStatement.setObject(7, dto.getCls());
			preparedStatement.setObject(8, dto.getName());
			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}
		return row > 0 ? true : false;
	}

	public boolean deleteByTrainNo(String trainNo) {
		Connection connection = null;
		int row = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "delete from train where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return row > 0 ? true : false;
	}

	public boolean deleteByTrainNoAndId(String trainNo, int id) {
		Connection connection = null;
		int row = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "delete from train where trainNo=? and id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			preparedStatement.setObject(2, id);
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return row > 0 ? true : false;
	}

	public TrainDto getAllByTrainNo(String trainNo) {
		Connection connection = null;
		try {
			connection = TrainUtil.getConnection();
			String sql = "select*from train where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getString(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getDouble(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				return dto;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return null;
	}

	public Collection<TrainDto> getAll() {
		Connection connection = null;
		Collection<TrainDto> collection = new ArrayList<TrainDto>();
		try {
			connection = TrainUtil.getConnection();
			String sql = "select*from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getString(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getDouble(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return collection;
	}

	public Collection<TrainDto> getAllByBoarding(String boarding) {
		Connection connection = null;
		Collection<TrainDto> collection = new ArrayList<TrainDto>();
		try {
			connection = TrainUtil.getConnection();
			String sql = "select*from train where boarding=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, boarding);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getString(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getDouble(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return collection;
	}

	public Collection<TrainDto> getAllByDestination(String destination) {
		Connection connection = null;
		Collection<TrainDto> collection = new ArrayList<TrainDto>();
		try {
			connection = TrainUtil.getConnection();
			String sql = "select*from train where destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, destination);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getString(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getDouble(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return collection;
	}

	public boolean updateDestinationBytrainNo(String dest, String trainNo) {
		Connection connection = null;
		int row = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "update train set destination=? where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(2, trainNo);
			preparedStatement.setObject(1, dest);
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return row > 0 ? true : false;
	}

	public boolean updateDestinationAndBoardingBytrainNo(String dest, String boarding, String trainNo) {
		Connection connection = null;
		int row = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "update train set destination=?, boarding=? where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dest);
			preparedStatement.setObject(2, boarding);
			preparedStatement.setObject(3, trainNo);
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return row > 0 ? true : false;
	}

	public int getTotal() {
		Connection connection = null;
		int rows = 0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "select count(*) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				rows = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return rows;
	}

	public double getMaxPrice() {
		Connection connection = null;
		double max = 0.0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "select max(price) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				max = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return max;
	}

	public double getMinPrice() {
		Connection connection = null;
		double min = 0.0;
		try {
			connection = TrainUtil.getConnection();
			String sql = "select min(price) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				min = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);

		}

		return min;
	}
}
