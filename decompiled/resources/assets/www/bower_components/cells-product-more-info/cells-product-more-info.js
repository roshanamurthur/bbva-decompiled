/**
 *
 * # cells-product-more-info
 *
 * ![Certificated](https://img.shields.io/badge/certificated-yes-brightgreen.svg)
 * ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 *
 * [Demo of component in Cells Catalog](https://catalogs.platform.bbva.com/cells)
 *
 * shows more information about a product, such as general information, interveners and conditions or limits. The info may show masked, so the button will trigger an event to get the info unmasked.
 *
 * Example:
 *
 * ```html
 *     <cells-product-more-info
 *       product="[[product]]"
 *       local-currency="EUR"
 *       date-format="DD MM YYYY">
 *     </cells-product-more-info>
 * ```
 *
 * ## Data Model
 *
 * ```json
 * [{
 *     "title": "cells-product-more-info-general",
 *     "items": [{
 *         "key": "cells-product-more-info-alias",
 *         "value": "Credit Card."
 *       },
 *       {
 *         "key": "cells-product-more-info-account-number",
 *         "value": "4940 190360",
 *         "label": true
 *       },
 *       {
 *         "key": "cells-product-more-info-account-number",
 *         "value": "8649 294722",
 *         "label": true,
 *         "textInfo": "cells-product-more-info-account-cci-info",
 *         "iconInfo": "coronita:info"
 *       },
 *       {
 *         "key": "cells-product-more-info-account-number",
 *         "value": "8649 294722",
 *         "classInfo": "info-tab",
 *         "textInfo": "cells-product-more-info-account-cci-info",
 *         "subtextInfo": "cells-product-more-info-account-cci-subinfo"
 *       }
 *     ]
 *   },
 *   {
 *     "title": "cells-product-more-info-conditions",
 *     "items": [{
 *       "key": "Annual Card Maintenance Fee",
 *       "isAmount": true,
 *       "value": {
 *         "amount": 30,
 *         "currency": "EUR"
 *       }
 *     }]
 *   }
 * ]
 * ```
 *  ## Styling
 *
 * The following custom properties and mixins are available for styling:
 *
 * ### Custom Properties
 * | Custom Property                                                    | Selector                                                                       | CSS Property                                      | Value                                                            |
 * | ------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------- | ---------------------------------------------------------------- |
 * | --cells-product-more-info-bg-color                                 | :host                                                                          | background-color                                  | --bbva-100                                                       |
 * | --cells-fontDefault                                                | :host                                                                          | font-family                                       | `No fallback value`                                              |
 * | --cells-text-size-ml                                               | .empty                                                                         | font-size                                         | 0.9375rem                                                        |
 * | --cells-st-link-color                                              | .empty cells-st-link                                                           | color                                             | --bbva-medium-blue                                               |
 * | --cells-st-link-info-message-margin-top                            | .info-message cells-st-link                                                    | margin-top                                        | 0.5rem                                                           |
 * | --cells-text-size-ml                                               | :host(.section-title-font-sm) .section-title                                   | font-size                                         | 0.9375rem                                                        |
 * | --bbva-dark-core-blue                                              | :host(.dark-blue-info-list-icon) .info-list .info-list-dd-info cells-atom-icon | --cells-product-more-info-list-dd-info-icon-color | ![#043263](https://placehold.it/15/043263/000000?text=+) #043263 |
 * | --cells-product-more-info-dt-color                                 | .info-list .info-list-dd-info                                                  | color                                             | --bbva-500                                                       |
 * | --cells-text-size-xs                                               | .info-list .info-list-dd-info                                                  | font-size                                         | 0.75rem                                                          |
 * | --cells-product-more-info-dt-color-info-tab                        | .info-list .info-list-dd-info.info-tab .text-info                              | color                                             | --bbva-600                                                       |
 * | --cells-product-more-info-dd-color                                 | .info-list .info-list-dd-info.with_info_not_margin                             | color                                             | --bbva-600                                                       |
 * | --cells-text-size-l                                                | .info-list .info-list-dd-info.with_info_not_margin                             | font-size                                         | 1rem                                                             |
 * | --cells-fontDefaultNormal                                          | .info-list .info-list-dd-info.with_info_not_margin                             | font-weight                                       | `No fallback value`                                              |
 * | --cells-product-more-info-list-dd-info-icon-color                  | .info-list .info-list-dd-info cells-atom-icon                                  | color                                             | --bbva-light-blue                                                |
 * | --bbva-core-blue                                                   | .info-list .icon-color-core-blue cells-atom-icon                               | color                                             | ![#043263](https://placehold.it/15/043263/000000?text=+) #043263 |
 * | --bbva-medium-blue                                                 | .info-list .bullets-collection .collection-item-container cells-atom-icon      | color                                             | ![#237ABA](https://placehold.it/15/237ABA/000000?text=+) #237ABA |
 * | --bbva-core-blue                                                   | .color-core-blue                                                               | --cells-product-more-info-list-dd-info-icon-color | ![#043263](https://placehold.it/15/043263/000000?text=+) #043263 |
 * | --bbva-core-blue                                                   | .disabled-color-core-blue                                                      | --cells-product-more-info-list-dd-info-icon-color | ![#043263](https://placehold.it/15/043263/000000?text=+) #043263 |
 * | --bbva-icon-diabled-opacity                                        | .disabled-color-core-blue                                                      | opacity                                           | 0.4                                                              |
 * | --cells-product-more-info-amount-color                             | cells-atom-amount                                                              | color                                             | --bbva-600                                                       |
 * | --cells-product-more-info-date-color                               | cells-atom-date                                                                | --cells-atom-date-color                           | --bbva-600                                                       |
 * | --cells-product-more-info-button-link-color                        | cells-st-button                                                                | --cells-st-button-text-color-link                 | --bbva-medium-blue                                               |
 * | --cells-text-size-ml                                               | cells-st-button button                                                         | font-size                                         | 0.9375rem                                                        |
 * | --cells-product-more-info-section-title-color                      | .section-title                                                                 | color                                             | --bbva-600                                                       |
 * | --cells-text-size-ml                                               | .section-title                                                                 | font-size                                         | 0.9375rem                                                        |
 * | --bbva-dark-medium-blue                                            | .toolTip                                                                       | color                                             | ![#1973b8](https://placehold.it/15/1973b8/000000?text=+) #1973b8 |
 * | --cells-text-size-ml                                               | div.descriptive-list                                                           | font-size                                         | 0.9375rem                                                        |
 * | --cells-text-size-14                                               | div.descriptive-list .item-subtitle                                            | font-size                                         | 0.875rem                                                         |
 * | --bbva-500                                                         | div.descriptive-list .item-subtitle                                            | color                                             | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-product-more-info-item-button-justify-content              | div.descriptive-list .item button                                              | justify-content                                   | unset                                                            |
 * | --cells-product-more-info-item-button-padding-left                 | div.descriptive-list .item button                                              | padding-left                                      | 0                                                                |
 * | --bbva-dark-medium-blue                                            | div.descriptive-list .item .toolTip                                            | color                                             | ![#1973b8](https://placehold.it/15/1973b8/000000?text=+) #1973b8 |
 * | --cells-product-more-info-dd-color                                 | div.descriptive-list .item .link-text                                          | color                                             | --bbva-600                                                       |
 * | --cells-text-size-ml                                               | div.descriptive-list .item .link-text                                          | font-size                                         | 0.9375rem                                                        |
 * | --cells-step-legal-terms-link-color                                | div.descriptive-list .item .link-text strong                                   | color                                             | ![#236ebf](https://placehold.it/15/236ebf/000000?text=+) #236ebf |
 * | --cells-step-legal-terms-link-color                                | div.descriptive-list .item .link-text.strong                                   | color                                             | ![#236ebf](https://placehold.it/15/236ebf/000000?text=+) #236ebf |
 * | --cells-product-more-info-dt-color                                 | div.descriptive-term                                                           | color                                             | --bbva-500                                                       |
 * | --cells-product-more-info-dd-color                                 | dd                                                                             | color                                             | --bbva-600                                                       |
 * | --cells-text-size-ml                                               | dd                                                                             | font-size                                         | 0.9375rem                                                        |
 * | --cells-product-more-info-key-info-message-margin                  | cells-icon-message.key-info-message                                            | margin                                            | 0.5rem 0                                                         |
 * | --cells-product-more-info-key-info-message-font-size               | cells-icon-message.key-info-message                                            | font-size                                         | --cells-text-size-xs                                             |
 * | --cells-product-more-info-key-info-message-color                   | cells-icon-message.key-info-message                                            | color                                             | --bbva-500                                                       |
 * | --cells-product-more-info-icon-wrapper-padding                     | .icon-wrapper                                                                  | padding                                           | 1.25rem 0rem                                                     |
 * | --bbva-300                                                         | .icon-wrapper button[disabled] cells-atom-icon                                 | color                                             | ![#D3D3D3](https://placehold.it/15/D3D3D3/000000?text=+) #D3D3D3 |
 * | --cells-product-more-info-icon-wrapper-cells-atom-icon-margin-left | .icon-wrapper cells-atom-icon                                                  | margin-left                                       | 1rem                                                             |
 * | --cells-product-item-title-color                                   | .icon-wrapper cells-atom-icon                                                  | color                                             | ![#2A86CA](https://placehold.it/15/2A86CA/000000?text=+) #2A86CA |
 * | --bbva-600                                                         | .avatar-item-title div.descriptive-term                                        | color                                             | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --bbva-500                                                         | .avatar-item-subtitle div.descriptive-term                                     | color                                             | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --bbva-dark-medium-blue                                            | .icon-wrapper cells-atom-icon                                                  | color                                             | ![#1973b8](https://placehold.it/15/1973b8/000000?text=+) #1973b8 |
 * | --bbva-500                                                         | cells-avatar-item > --cells-avatar-item-list-secondary:                        | color                                             | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-text-size-ml                                               | cells-avatar-item > --cells-avatar-item-list-secondary:                        | font-size                                         | .9375rem                                                         |
 * | --bbva-600                                                         | cells-avatar-item > --cells-avatar-item-list-title-has-subtitle:               | color                                             | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --bbva-600                                                         | cells-avatar-item > --cells-avatar-secondary-extra-icon:                       | color                                             | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --bbva-white-medium-blue                                           | cells-avatar-item                                                              | --cells-contact-avatar-initial-bg                 | ![#49a5e6](https://placehold.it/15/49a5e6/000000?text=+) #49a5e6 |
 * | --bbva-dark-medium-blue                                            | cells-avatar-item                                                              | --cells-contact-avatar-initial-color-bg           | ![#1973b8](https://placehold.it/15/1973b8/000000?text=+) #1973b8 |
 * | --bbva-500                                                         | .label-dropdown-title                                                          | color                                             | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --bbva-300                                                         | cells-st-button button[disabled] cells-atom-icon                               | color                                             | ![#D3D3D3](https://placehold.it/15/D3D3D3/000000?text=+) #D3D3D3 |
 * | --bbva-navy                                                        | .text-info-dark-blue-icon                                                      | color                                             | ![#072146](https://placehold.it/15/072146/000000?text=+) #072146 |
 * | --cells-product-more-info-value-description-margin-left            | .value-description                                                             | margin-left                                       | 0.25rem                                                          |
 * | --cells-product-more-info-value-description-font-weight            | .value-description                                                             | font-weight                                       | 400                                                              |
 * | --cells-product-more-info-icons-center-vertically-display          | .icons-center-vertically                                                       | display                                           | flex                                                             |
 * | --cells-product-more-info-icons-center-vertically-align-items      | .icons-center-vertically                                                       | align-items                                       | center                                                           |
 * | --cells-product-more-info-spacing-bottom-item-s-margin-bottom      | :host(.spacing-bottom-item-s) .item .flex-container--row                       | margin-bottom                                     | 0.5rem                                                           |
 * | --cells-product-more-info-flex-item-row-display                    | .flex-item-row                                                                 | display                                           | flex                                                             |
 * | --cells-product-more-info-flex-item-row-flex-direction             | .flex-item-row                                                                 | flex-direction                                    | row                                                              |
 * | --cells-product-more-info-flex-item-row-flex-direction             | .flex-item-row                                                                 | justify-content                                   | space-between                                                    |
 * | --cells-product-more-info-flex-item-row-width                      | .flex-item-row                                                                 | width                                             | 100%                                                             |
 * | --cells-fontDefaultMedium                                          | .flex-item-row div.descriptive-detail                                          | font-weight                                       | 500                                                              |
 * ### @apply
 * | Mixins                                                  | Selector                                                               | Value |
 * | ------------------------------------------------------- | ---------------------------------------------------------------------- | ----- |
 * | --cells-product-more-info                               | :host                                                                  | {}    |
 * | --cells-product-more-info-info-message                  | .info-message                                                          | {}    |
 * | --cells-product-more-info-add-margin                    | :host(.add-margin) .item button                                        | {}    |
 * | --cells-fontDefaultMediumItalic                         | :host(.highlighted-date) cells-atom-date                               | {}    |
 * | --cells-product-more-info-content                       | .content                                                               | {}    |
 * | --cells-product-more-info-list                          | .info-list                                                             | {}    |
 * | --cells-product-more-info-card-cover                    | .info-list cells-molecule-card-cover-cvv                               | {}    |
 * | --cells-fontDefaultNormal                               | .info-list .info-list-dd-info                                          | {}    |
 * | --cells-product-more-info-list-dd-info                  | .info-list .info-list-dd-info                                          | {}    |
 * | --cells-product-more-info-list-dd-info-tab              | .info-list .info-list-dd-info.info-tab                                 | {}    |
 * | --cells-fontDefaultNormal                               | .info-list .info-list-dd-info.info-tab .text-info                      | {}    |
 * | --cells-product-more-info-list-dd-text-info             | .info-list .info-list-dd-info.info-tab .text-info                      | {}    |
 * | --cells-product-more-info-list-dd-info-text-not-margin  | .info-list .info-list-dd-info.with_info_not_margin                     | {}    |
 * | --cells-product-more-info-list-dd-info-text             | .info-list .info-list-dd-info p                                        | {}    |
 * | --cells-product-more-info-list-dd-info-icon             | .info-list .info-list-dd-info cells-atom-icon                          | {}    |
 * | --cells-product-more-info-icon-color-core-blue          | .info-list .icon-color-core-blue                                       | {}    |
 * | --cells-product-more-info-icons                         | .info-list .icon-color-core-blue cells-atom-icon                       | {}    |
 * | --cells-product-more-info-disabled-color-core-blue-icon | .disabled-color-core-blue                                              | {}    |
 * | --cells-product-more-info-amount                        | cells-atom-amount                                                      | {}    |
 * | --cells-fontDefaultMediumItalic                         | cells-atom-date                                                        | {}    |
 * | --cells-product-more-info-date                          | cells-atom-date                                                        | {}    |
 * | --cells-product-more-info-button-label                  | cells-st-button                                                        | {}    |
 * | --cells-fontDefaultMedium                               | cells-st-button button                                                 | {}    |
 * | --cells-product-more-info-button-label-focus            | cells-st-button button:focus                                           | {}    |
 * | --cells-fontDefaultMedium                               | .section-title > --cells-product-more-info-section-title:              | {}    |
 * | --small-heading                                         | .section-title                                                         | {}    |
 * | --tertiary-heading                                      | .section-title                                                         | {}    |
 * | --cells-product-more-info-section-title                 | .section-title                                                         | {}    |
 * | --cells-product-more-info-title-tooltip                 | .toolTip                                                               | {}    |
 * | --cells-product-more-info-dl                            | div.descriptive-list                                                   | {}    |
 * | --cells-product-more-info-dl-border-bottom              | div.descriptive-list:not(:last-of-type)                                | {}    |
 * | --cells-product-more-info-dl-item-subtitle              | div.descriptive-list .item-subtitle                                    | {}    |
 * | --cells-product-more-info-dl-item-subtitle-separator    | div.descriptive-list .item-subtitle.item-separator:not(:first-of-type) | {}    |
 * | --cells-product-more-info-dl-item                       | div.descriptive-list .item                                             | {}    |
 * | --cells-product-more-info-tooltip                       | div.descriptive-list .item .toolTip                                    | {}    |
 * | --cells-fontDefaultMedium                               | div.descriptive-list .item .link-text strong                           | {}    |
 * | --cells-fontDefaultMedium                               | div.descriptive-list .item .link-text.strong                           | {}    |
 * | --cells-fontDefaultNormal                               | div.descriptive-term                                                   | {}    |
 * | --cells-product-more-info-dt                            | div.descriptive-term                                                   | {}    |
 * | --cells-product-more-info-dt-item-key                   | div.descriptive-term span.item-key                                     | {}    |
 * | --cells-fontDefaultNormal                               | dd                                                                     | {}    |
 * | --cells-product-more-info-dd                            | dd                                                                     | {}    |
 * | --cells-product-more-info-skeleton                      | cells-skeleton-item                                                    | {}    |
 * | --cells-product-more-info-skeleton-skeleton             | cells-skeleton-item + cells-skeleton-item                              | {}    |
 * | --cells-product-more-info-skeleton-custom               | cells-skeleton-custom                                                  | {}    |
 * | --cells-product-more-info-list-flex-container-row       | .flex-container--row                                                   | {}    |
 * | --cells-product-more-info-list-flex-container-column    | .flex-container--column                                                | {}    |
 * | --cells-product-more-info-icon-message                  | cells-icon-message                                                     | {}    |
 * | --cells-fontDefaultNormal                               | cells-icon-message.key-info-message                                    | {}    |
 * | --cells-product-more-info-key-info-message              | cells-icon-message.key-info-message                                    | {}    |
 * | --cells-product-more-info-icon-wrapper                  | .icon-wrapper                                                          | {}    |
 * | --cells-product-more-info-button                        | .icon-wrapper button                                                   | {}    |
 * | --cells-product-more-info-icon-disabled                 | .icon-wrapper button[disabled] cells-atom-icon                         | {}    |
 * | --cells-product-more-info-icons                         | .icon-wrapper cells-atom-icon                                          | {}    |
 * | --cells-product-more-info-avatar-item                   | .avatar-item                                                           | {}    |
 * | --cells-product-more-info-avatar-item-icon-wrapper      | .avatar-item.icon-wrapper                                              | {}    |
 * | --cells-product-more-info-avatar-subitem-title          | .avatar-subitem-title                                                  | {}    |
 * | --cells-product-more-info-avatar-item-title-dt          | .avatar-item-title div.descriptive-term                                | {}    |
 * | --cells-product-more-info-avatar-item-subtitle          | .avatar-item-subtitle                                                  | {}    |
 * | --cells-product-more-info-avatar-item-email             | .avatar-item-email                                                     | {}    |
 * | --cells-product-more-info-main-buttons                  | .main-buttons                                                          | {}    |
 * | --cells-fontDefaultMedium                               | .avatar-item-subtitle div.descriptive-term                             | {}    |
 * | --cells-product-more-info-avatar-item-subtitle-dt       | .avatar-item-subtitle div.descriptive-term                             | {}    |
 * | --cells-product-more-info-icon-wrapper-cells-atom-icon  | .icon-wrapper cells-atom-icon                                          | {}    |
 * | --cells-fontDefaultNormalItalic                         | cells-avatar-item > --cells-avatar-item-list-secondary:                | {}    |
 * | --cells-fontDefaultMedium                               | cells-avatar-item > --cells-avatar-item-list-title-has-subtitle:       | {}    |
 * | --cells-fontDefaultMedium                               | cells-avatar-item > --cells-avatar-secondary-extra-icon:               | {}    |
 * | --cells-product-more-info-cells-avatar-item             | cells-avatar-item                                                      | {}    |
 * | --cells-product-more-info-label-dropdown                | .label-dropdown                                                        | {}    |
 * | --cells-product-more-info-label-dropdown-title          | .label-dropdown-title                                                  | {}    |
 * | --cells-product-more-info-subItem-container             | .subItem-container                                                     | {}    |
 * | --cells-product-more-info-subItem-container-items       | .subItem-container-items                                               | {}    |
 * | --cells-product-more-info-subItem-container-icons       | .subItem-container-icons                                               | {}    |
 * | --cells-product-more-info-button                        | cells-st-button button                                                 | {}    |
 * | --cells-product-more-info-icon-disabled                 | cells-st-button button[disabled] cells-atom-icon                       | {}    |
 * | --cells-product-more-info-text-info-icon-class          | .text-info-dark-blue-icon                                              | {}    |
 * | --cells-product-more-info-full-section-division         | :host(.full-section-division)                                          | {}    |
 * | --cells-product-more-info-info-list                     | :host(.full-section-division) .info-list                               | {}    |
 * | --cells-product-more-molecule-mask                      | cells-molecule-mask                                                    | {}    |
 * | --cells-product-more-info-alternative-masked-number     | :host(.alternative-masked-number)                                      | {}    |
 * | --cells-fontDefaultNormal                               | :host(.alternative-masked-number) cells-molecule-mask                  | {}    |
 * | --cells-product-more-info-value-description             | .value-description                                                     | {}    |
 * | --cells-product-more-info-icons-center-vertically       | .icons-center-vertically                                               | {}    |
 * | --cells-product-more-info-spacing-bottom-item-s         | :host(.spacing-bottom-item-s)                                          | {}    |
 * | --cells-product-more-info-flex-item-row                 | .flex-item-row                                                         | {}    |
 *
 * @polymer
 * @customElement
 * @extends {Polymer.Element}
 * @hero cells-product-more-info.png
 * @demo demo/index.html
 */
class CellsProductMoreInfo extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], Polymer.Element) {
  static get is() {
    return 'cells-product-more-info';
  }

  static get properties() {
    return {
      product: {
        type: Array,
        value: function() {
          return [];
        },
        observer: '_setProductConfig'
      },
      localCurrency: { type: String },
      dateFormat: { type: String },
      locale: { type: String },
      buttonText: String,
      itemKey: String,
      loaded: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to manage skeleton when product item is still not loaded
       */
      productItemLoaded: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to show product item skeleton
       */
      showProductItemSkeleton: {
        type: Boolean,
        value: false
      },
      /**
       * If true, dividers are displayed in skeleton
       */
      showSkeletonDividers: {
        type: Boolean,
        value: false
      },
      /**
       * Array containing product items configured to be loaded
       */
      productItems: {
        type: Array,
        value: () => ([])
      },
      /*
       * Property to show error message on error data request
       */
      errorOnLoad: {
        type: Boolean,
        value: false
      },
      /**
       * Object with default images in case the
       * image urls are failing
       */
      defaultImages: {
        type: Object,
        value: () => ({})
      },
      /**
       * Hides the button if its not share-button
       */
      hideNotShareButton: {
        type: Boolean,
        value: false
      },
      skeletonItems: { type: Number },
      hasIcons: {
        type: Boolean,
        value: false
      },
      productId: {
        type: String
      },
      /**
       * Params to snackbar
       * @type object
       */
      toastSnackBarParams: {
        type: Object
      },
      /**
       * Show subItems
       */
      showSubItems: {
        type: Boolean,
        value: false
      },
      /**
       * Show button add subItems
       */
      hideAddSubItems: {
        type: Boolean,
        value: false
      },
      /**
      * String for navigation purposes
      */
      productType: {
        type: String
      },
      /**
       * Set class cells-avatar-component
       */
      avatarClass: {
        type: String,
        value: 'avatar-item'
      },
      /**
       * Set custom class for icon wrapper
       * @type {String}
       */
      iconClass: {
        type: String,
        value: ''
      },
      /**
       * Primary button config footer section
       */
      actionButton: {
        type: Object,
        value: {}
      },
      /**
       * Secondary button config footer section
       */
      linkButton: {
        type: Object,
        value: {}
      },
      /**
       * Set class to sub items
       */
      subItemClass: {
        type: String,
        value: 'avatar-item-email'
      },
      urlLink: {
        type: String,
      },
      _hasFooterButtons: {
        type: Boolean,
        value: false,
        computed: '_computeHasFooterButtons(loaded, actionButton, linkButton)'
      },
      hasProductItemSkeleton: {
        type: Boolean,
        value: false,
        computed: '_computeHasProductItemSkeleton(showProductItemSkeleton, loaded, productItemLoaded, errorOnLoad)'
      }
    };
  }

  sendDescriptionUri() {
    const params = {
      scheme: `${this.t('cells-product-more-info-link-credit-cards')}`,
      packageId: null
    };
    this._dispatchCustomEvent('send-description-uri', params);
  }

  reset() {
    this.set('product', []);
    this.loaded = false;
    this.hideAddSubItems = false;
    this.showSubItems = false;
    this.hasIcons = false;
    this.productId = '';
    this.hideNotShareButton = false;
    this.productItemLoaded = false;
    this.errorOnLoad = false;
  }

  _setProductConfig(product) {
    var lang = window.I18nMsg ? window.I18nMsg.lang : 'en';
    this.set('locale', lang);
    if (product && product.length) {
      this.loaded = true;
      this.productItemLoaded =  this.productItems.some(productItem => product.some((item) => item?.title === productItem));
    } else {
      this.loaded = false;
    }
  }

  /**
   * Check if skeleton shold be loaded
   * @param {Boolean} showProductItemSkeleton
   * @param {Boolean} loaded
   * @param {Boolean} productItemLoaded
   * @param {Boolean} errorOnLoad
   * @returns {Boolean}
   */
  _computeHasProductItemSkeleton(showProductItemSkeleton, loaded, productItemLoaded, errorOnLoad) {
    return showProductItemSkeleton && loaded && !productItemLoaded && !errorOnLoad;
  }

  _computeHasFooterButtons(loaded, actionButton, linkButton) {
    return loaded && (Object.keys(actionButton).length !== 0 || Object.keys(linkButton).length !== 0) ? true : false;
  }

  _clickButton(ev) {
    ev.preventDefault();
    let item = this.get('model.item', ev) || this.get('model.category.label', ev) || {};
    if (item.masked) {
      this._dispatchCustomEvent(item.event ? item.event : 'cells-product-more-info-unmask-data', item);
    } else if (item.share) {
      this._dispatchCustomEvent('share-product-info', {
        page: 'share-product-info',
        product: this.product,
        productType: this.productType,
        startChecked: item.key
      });
    } else if (item.iconButton) {
      const eventName = item.iconButton.eventName || 'cells-product-more-info-icon-click';
      this._dispatchCustomEvent(eventName, {
        key: item.key,
        value: item.value
      });
    } else {
      this._setItemKey(item);
    }
  }

  _setItemKey(item) {
    this.set('itemKey', item.key + '-copy');

    let detail = item.value;

    if (item.mask) {
      detail = item.mask.value;
    }

    if (item.params) {
      item.params.forEach(p => {
        detail[p] = this.get(p);
      });
    }

    this._dispatchCustomEvent('cells-product-more-info-item-key', this.itemKey);

    if (item.id) {
      detail = { id: item.id };
    }

    this._dispatchCustomEvent(item.event ? item.event : 'cells-product-more-info-button-click', detail);
  }

  /**
  * Fires a 'cells-product-summary-more-info-additional-link' event when more info button is clicked
  * @event cells-product-summary-more-info-additional-link
  */
  _additionalLinkClicked() {
    this.dispatchEvent(new CustomEvent('cells-product-summary-more-info-additional-link', {
      bubbles: true,
      composed: true,
      detail: {
        productType: this.productType,
        productId: this.productId
      }
    }));
  }

  clickOnActionButton() {
    let eventName = 'cells-product-more-info-action-button-clicked';
    if (this.actionButton.eventName) {
      eventName = this.actionButton.eventName;
    }
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: this.productId
    }));
  }

  clickOnLinkButton() {
    let eventName = 'cells-product-more-info-link-button-clicked';
    if (this.linkButton.eventName) {
      eventName = this.linkButton.eventName;
    }
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: this.productId
    }));
  }

  /**
  * Fires a 'cells-product-more-info-back-request' event when back button is pressed
  * @event cells-product-more-info-back-request
  */
  backRequest() {
    this.dispatchEvent(new CustomEvent('cells-product-more-info-back-request', {
      bubbles: true,
      composed: true,
      detail: {
        productId: this.productId
      }
    }));
  }

  _launchKey() {
    this.dispatchEvent(new CustomEvent('cells-product-more-info-key', {
      bubbles: true,
      composed: true,
      detail: this._getToastSnackBarParams()
    }));
    this.set('itemKey', '');
  }

  _getToastSnackBarParams() {
    this.set('toastSnackBarParams.message', this.t(this.itemKey));
    return this.toastSnackBarParams;
  }

  _setButtonText(item = {}) {
    let buttonText;

    if (item.buttonLabel) {
      buttonText = item.buttonLabel;
    } else if (item.masked) {
      buttonText = 'cells-product-more-info-label';
    } else if (this.buttonText) {
      buttonText = this.buttonText;
    } else if (item.share) {
      buttonText = 'cells-product-more-info-share-label';
    } else if (item.labelText) {
      buttonText = item.labelText;
    } else {
      buttonText = 'cells-product-more-info-copy-label';
    }
    return this.t(buttonText);
  }

  _generateSkeletonItems(skeletonItems) {
    return Array.from(Array(skeletonItems), function(_, items) {
      return items;
    });
  }

  /**
   * Checks if the button should be hidden
   * @param {Boolean} itemMasked
   * @param {Boolean} isDate
   * @param {Boolean} isShare
   */
  isButtonHidden(itemMasked, isDate, isShare) {
    return (!itemMasked && isDate) || (this.hideNotShareButton && !isShare);
  }

  /**
   * Checks if the icon button should be visible
   * @param {Boolean} isLabel
   * @param {Boolean} isIcon
   */
  _isIconButtonVisible(isLabel, isIcon) {
    return (!isLabel && isIcon) ? true : false;
  }

  setInfoClass(item) {
    return item ? 'with-info' : '';
  }

  /**
   * Toggle skeleton class
   * @param {Boolean} showSkeletonDividers
   * @returns {String}
   */
  setProductItemClass(showSkeletonDividers) {
    return showSkeletonDividers ? 'product-item-skeleton' : '';
  }

  /**
  * Dispatches a new customEvent with the given name and detail.
  * Bubbles and composed are true by default
  * @param {String} eventName
  * @param {Any} detail event detail
  */
  _dispatchCustomEvent(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(eventName, {detail, bubbles, composed}));
  }

  /**
  * Dispatches a new customEvent when click on icon help.
  * @param {Object} event
  */
  _clickIconHelp(evt) {
    let item = this.get('target.dataset.event', evt);
    this.dispatchEvent(new CustomEvent('cells-product-more-info-help-click', {
      bubbles: true,
      composed: true,
      detail: item
    }));
  }

  iconBtnClicked(evt) {
    const eventName = this.get('model.item.eventName', evt) || this.get('model.__data.avatarIcon.eventName', evt) || this.get('model.iconItem.eventName', evt);
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: eventName
    }));
  }

  emailIconBtnClicked(evt) {
    const eventName = this.get('model.item.eventName', evt) || this.get('model.__data.avatarIcon.eventName', evt) || this.get('model.iconItem.eventName', evt);
    const value = this.get('model.item.value', evt) || this.get('model.__data.avatarIcon.value', evt) || this.get('model.iconItem.value', evt);

    this._dispatchCustomEvent(eventName, value);
  }

  /**
   * Show dropdown of each item and change expand icon
   */
  showDropdown(evt) {
    const indexItem = this.get('model.__data.categoryIndex', evt);
    this.set(`product.${indexItem}.dropdown.showSubItems`, !this.product[indexItem].dropdown.showSubItems);
    this.set(`product.${indexItem}.dropdown.iconList.icon`, this.product[indexItem].dropdown.iconList.icon === 'coronita:expand' ? 'coronita:collapse' : 'coronita:expand');
  }

  _moreInfoLinkClick(ev) {
    let item = this.get('target.dataset.event', ev);
    this.dispatchEvent(new CustomEvent(item || 'cells-product-more-info-link-click', {
      bubbles: true,
      composed: true,
      detail: item
    }));
  }

  /**
   * Launch event to add new email
   */
  clickAddSubItemBtn() {
    this._dispatchCustomEvent('add-new-item-email', {});
  }

  /**
   * Category container css class
   * @param {Object} category
   */
  _categoryContainerClass(category) {
    const direction = this.get('label.vertical', category) ? 'column' : 'row';
    return `flex-container--${direction}`;
  }

  /**
   * Amount type item scale
   * @param {Object} value amount params
   */
  _getAmountScale(value) {
    return value.scale || 0;
  }

  /**
   * Amount type item abbreviations
   * @param {Object} value amount params
   */
  _getAmountAbbreviations(value) {
    return value.abbreviations || {};
  }

  /**
   * Launch event with the information of the product
   */
  _clickShareAllInformation() {
    this._dispatchCustomEvent('send-product-info', this.product);
  }

  /**
  * Checks if the icon should be display or not
  * @param {Number} index
  * @param {Object} category
  */
  _isShareAllInformation(index, category) {
    if (category) {
      return index === 0 && category.title === 'cells-account-more-info-general';
    } else {
      return false;
    }
  }

  /**
  * Fires an event when click on button with mask
  * @event cells-product-more-info-unmask-data
  */

  /**
  * Fires an event when click on icon
  * @event cells-product-more-info-icon-click
  */

  /**
  * Fires an event when click on button
  * @event cells-product-more-info-button-click
  */

  /**
  * Fires an event when launch key
  * @event cells-product-more-info-key
  */

  /**
  * Fires an event when click on icon help
  * @event cells-product-more-info-help-click
  */

  /**
   * Adds an empty class to distinguish when it's a related contracts
   * @param {String} value
   */
  _isRelatedContracts(value = []) {
    return value.includes('related-contracts') ? 'related-contracts' : '';
  }
}
window.customElements.define(CellsProductMoreInfo.is, CellsProductMoreInfo);
