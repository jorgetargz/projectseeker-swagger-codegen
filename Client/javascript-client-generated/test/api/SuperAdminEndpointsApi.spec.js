/*
 * Project Seeker API
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.42
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ProjectSeekerApi);
  }
}(this, function(expect, ProjectSeekerApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ProjectSeekerApi.SuperAdminEndpointsApi();
  });

  describe('(package)', function() {
    describe('SuperAdminEndpointsApi', function() {
      describe('disableUser', function() {
        it('should call disableUser successfully', function(done) {
          // TODO: uncomment, update parameter values for disableUser call
          /*

          instance.disableUser(email, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('enableUser', function() {
        it('should call enableUser successfully', function(done) {
          // TODO: uncomment, update parameter values for enableUser call
          /*

          instance.enableUser(email, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getUserByEmail', function() {
        it('should call getUserByEmail successfully', function(done) {
          // TODO: uncomment, update parameter values for getUserByEmail call and complete the assertions
          /*

          instance.getUserByEmail(email, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProfileDTO);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
