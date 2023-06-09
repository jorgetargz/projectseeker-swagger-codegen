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
    instance = new ProjectSeekerApi.ProjectsEndpointsApi();
  });

  describe('(package)', function() {
    describe('ProjectsEndpointsApi', function() {
      describe('assignFreelancer', function() {
        it('should call assignFreelancer successfully', function(done) {
          // TODO: uncomment, update parameter values for assignFreelancer call and complete the assertions
          /*

          instance.assignFreelancer(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createProject', function() {
        it('should call createProject successfully', function(done) {
          // TODO: uncomment, update parameter values for createProject call and complete the assertions
          /*

          instance.createProject(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('finishProject', function() {
        it('should call finishProject successfully', function(done) {
          // TODO: uncomment, update parameter values for finishProject call and complete the assertions
          /*

          instance.finishProject(id, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getInProgressProjectsByClientId', function() {
        it('should call getInProgressProjectsByClientId successfully', function(done) {
          // TODO: uncomment getInProgressProjectsByClientId call and complete the assertions
          /*

          instance.getInProgressProjectsByClientId(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getOpenProjects', function() {
        it('should call getOpenProjects successfully', function(done) {
          // TODO: uncomment getOpenProjects call and complete the assertions
          /*

          instance.getOpenProjects(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getOpenProjectsByClient', function() {
        it('should call getOpenProjectsByClient successfully', function(done) {
          // TODO: uncomment getOpenProjectsByClient call and complete the assertions
          /*

          instance.getOpenProjectsByClient(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getOpenProjectsBySkills', function() {
        it('should call getOpenProjectsBySkills successfully', function(done) {
          // TODO: uncomment, update parameter values for getOpenProjectsBySkills call and complete the assertions
          /*

          instance.getOpenProjectsBySkills(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getPrjectInfo', function() {
        it('should call getPrjectInfo successfully', function(done) {
          // TODO: uncomment, update parameter values for getPrjectInfo call and complete the assertions
          /*

          instance.getPrjectInfo(id, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getProjectsByAssignedFreelancer', function() {
        it('should call getProjectsByAssignedFreelancer successfully', function(done) {
          // TODO: uncomment getProjectsByAssignedFreelancer call and complete the assertions
          /*

          instance.getProjectsByAssignedFreelancer(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getProjectsByClient', function() {
        it('should call getProjectsByClient successfully', function(done) {
          // TODO: uncomment getProjectsByClient call and complete the assertions
          /*

          instance.getProjectsByClient(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getProjectsByOfferFreelancer', function() {
        it('should call getProjectsByOfferFreelancer successfully', function(done) {
          // TODO: uncomment getProjectsByOfferFreelancer call and complete the assertions
          /*

          instance.getProjectsByOfferFreelancer(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('submitOffer', function() {
        it('should call submitOffer successfully', function(done) {
          // TODO: uncomment, update parameter values for submitOffer call and complete the assertions
          /*

          instance.submitOffer(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ProjectSeekerApi.ProjectInfoDTO);

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
