=begin
#Bybit API

### REST API for the Bybit Exchange. 

OpenAPI spec version: 1.0.0
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::KlineApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'KlineApi' do
  before do
    # run before each test
    @instance = SwaggerClient::KlineApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of KlineApi' do
    it 'should create an instance of KlineApi' do
      expect(@instance).to be_instance_of(SwaggerClient::KlineApi)
    end
  end

  # unit tests for kline_get
  # Query historical kline.
  # @param symbol Contract type.
  # @param interval Kline interval.
  # @param from from timestamp.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :limit Contract type.
  # @return [Object]
  describe 'kline_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
